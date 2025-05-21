object task2 extends App {

    val taxpayerForenames: Seq[String] = Seq(//tax payer list
      "Ahmet",
      "Mehmet",
      "Ayşe",
      "Fatma",
      "Ahmet",
      "Mehmet",
      "Can",
      "Deniz"
    )

    val uniqueForenames: Seq[String] = taxpayerForenames.distinct // move to name duplicated

    println("Orijinal list:")
    println(taxpayerForenames)

    println("\n remove multible name :")
    println(uniqueForenames)


    val startsWithA: Seq[String] = taxpayerForenames.filter(name => name.startsWith("A")) // filter

    println("\n'A' ile başlayan isimler:") // name starting with a
    println(startsWithA)

    val listName: Seq[String] = Seq( // Q2
      "Ahmet",
      "Mehmet",
      "Ayşe",
      "Fatma",
      "Ahmet",
      "Mehmet",
      "Can",
      "Deniz"
    )

    println(s"All submissions: ${listName.mkString(", ")}") //

    val taxPayer: Seq[String] = Seq( //Q3
      "Ahmet",
      "Mehmet",
      "Ayşe",
      "Fatma",
      "Ahmet",
      "Mehmet",
      "Can",
      "Deniz"
    )

    def countSubmissions(name: String): Int = { //given taxpayer submitted
      taxPayer.count(_ == name)
    }

    val targetName = "Ahmet"
    println(s"$targetName submitted ${countSubmissions(targetName)} times.")

    // Sample data: list of people who submitted tax returns
    val submissions = List("John", "Emily", "John", "John", "Emily") //Q4

    // Count submissions per person
    val counts = submissions.groupBy(identity).view.mapValues(_.size).toMap // Count submissions per person


    counts.foreach { case (person, count) =>
      println(s"$person submitted their tax returns $count times.")
    }

    val seq = Seq("John", "Emily", "John", "John", "Emily") //Q5

    // Convert Seq to Set to remove duplicates
    val uniqueSet = seq.toSet

    println("Original Seq: " + seq)
    println("Set (duplicates removed): " + uniqueSet)


    val submissions1 = Seq("John", "Emily", "John", "John", "Emily", "Sophia") // Q6
    val uniqueTaxpayers = submissions1.toSet
    println("List of unique taxpayers who submitted:")
    uniqueTaxpayers.foreach { person =>
      println(s"- $person")
    }

    // Question 5 verisi: Seq ve Set
    val submissionSeq = Seq("John", "Emily", "John", "John", "Emily")
    val submissionSet = submissionSeq.toSet

    // Soru 7: Her kişiyi sayan ve Map döndüren fonksiyon
    def printSubmissionCounts(data: Iterable[String]): Map[String, Int] = {
      val counts = data.groupBy(identity).map { case (name, list) => (name, list.size) }
      counts.foreach { case (name, count) =>
        println(s"$name submitted $count time(s).")
      }
      counts // Bu Map[String, Int] olarak döner
    }

    // Soru 7: Kullanım
    println("Submission counts in Seq:")
    val seqCounts = printSubmissionCounts(submissionSeq)

    println("\nSubmission counts in Set:")
    val setCounts = printSubmissionCounts(submissionSet)

    // Soru 8: Her iki koleksiyondaki kullanıcıları karşılaştır
    println("\nSame taxpayers in both Seq and Set:")
    for (name <- submissionSet) {
      val inSeq = seqCounts.getOrElse(name, 0)
      val inSet = setCounts.getOrElse(name, 0)
      println(s"$name -> Seq: $inSeq time(s), Set: $inSet time(s)")
    }

    //  Q9: Imagine that the user of this service needs to login.
    // There are 6 users that have failed login attempts.

    val failedLogins = Seq("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice")

    // Her kullanıcı için kaç başarısız giriş denemesi olduğunu say
    val failedCounts = failedLogins.groupBy(identity).view.mapValues(_.size).toMap

    println("Q9 - Failed login attempts:")
    failedCounts.foreach { case (user, count) =>
      println(s"$user failed to login $count time(s).")
    }
    // Q9a - Create a map of users and their failed login attempts
    val failedAttempts = Map(
      "Alice" -> 2,
      "Bob" -> 1,
      "Charlie" -> 3,
      "Diana" -> 2,
      "Eve" -> 1,
      "Frank" -> 4
    )

    println("Q9a - Initial failedAttempts map:")
    failedAttempts.foreach { case (user, count) =>
      println(s"$user -> $count failed attempt(s)")
    }
    // Q9b - Print failed attempts of the user at index 0
    val userAtIndex0 = failedAttempts.keys.toSeq(0)
    println(s"\nQ9b - $userAtIndex0 has ${failedAttempts(userAtIndex0)} failed attempt(s).")

    // Q9c - Add a new user to the map
    val updatedAttemptsC = failedAttempts + ("Grace" -> 3)
    println("\nQ9c - Added Grace with 3 failed attempts:")
    updatedAttemptsC.foreach { case (user, count) =>
      println(s"$user -> $count")
    }


    // Q9e - Remove the user at index position 5

    val failedAttempts1 = Map(
      "Alice" -> 2,
      "Bob" -> 1,
      "Charlie" -> 3,
      "Diana" -> 2,
      "Eve" -> 1,
      "Frank" -> 4
    )

    val userAtIndex5 = failedAttempts1.keys.toSeq(5)

    val updatedAttempts = failedAttempts1 - userAtIndex5

    println(s"Removed user at index 5: $userAtIndex5")
    println("Updated map:")
    updatedAttempts.foreach { case (user, count) =>
      println(s"$user -> $count failed attempt")
    }

    //EXTENSION
    // Sets for Day 1 and Day 2 submissions
    val day1Submissions: Set[String] = Set("John", "Emily", "Sophia")
    val day2Submissions = Set("Emily", "Michael", "Sophia")

    // a) Who submitted on both days (intersection)
    val submittedBothDays = day1Submissions.intersect(day2Submissions)

    // b) Who submitted only on the first day (difference)
    val onlyDay1 = day1Submissions.diff(day2Submissions)

    // c) Combined list of all unique submitters (union)
    val allUniqueSubmitters = day1Submissions.union(day2Submissions)

    // Print the results
    println(s"a) Submitted on both days: $submittedBothDays")
    println(s"b) Submitted only on the first day: $onlyDay1")
    println(s"c) Combined unique submitters: $allUniqueSubmitters")
    /*
    Map.get(key)
    Description
  Map.get(key)	Returns an Option for the key — Some(value) or None if key not found
  Return
  Option[V] (Some or None)
    //
  Map(key)
  Description
  Directly accesses the value for the key. Throws exception if key not found
  returns
  Value (V) or throws NoSuchElementException
  //
  Map.getOrElse(key, default)
  Description
  Returns value if key exists; otherwise returns provided default value
  returns
  Value (V) or default value
  */


}
