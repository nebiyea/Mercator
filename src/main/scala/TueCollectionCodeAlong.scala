object TueCollectionCodeAlong extends App {
  val firstset: Set[Int] = Set(1, 2, 3, 4, 5)
  println("first set:" + firstset)

  val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5) // ordered allow
  println("firstSeq: " + firstSeq)

  val firstMap: Map[String, Int] = Map(
    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "0four" -> 4,
    "Five" -> 5,
  )
  println("First Map: " + firstMap)


  val getSeqHead: Int = firstSeq.head // intex position (first element)
  println("seq Head: " + getSeqHead)

  val getSeqTail: Seq[Int] = firstSeq.tail // everthing but the head
  println("Seq Tail:" + getSeqTail)

  val getSegIndex: Int = firstSeq(3) // only works with ordered collection
  println("getSeqTail" + getSegIndex)

  val getSetIndex: Boolean = firstset(30) // check is the value is contained in the set ( can also use . contains
  println(" Exist in set: " + getSetIndex)
  // offen filtrt information
  val filterSet: Set[Int] = firstset.filter(_ < 3)
  println("filter set:" + filterSet)

  val filterNotSet: Set[Int] = firstset.filterNot(_ < 3)
  println("filter not set: " + filterNotSet)

  //val evenSet: Set[Int] = firstSet.filter(_ % 2 == 0)
  //  val evenSet: Set[Int] = firstSet.filterNot(_ % 2 != 0)
  //println("Even Set: " + evenSet)

  //Map
  val getMapValue: Int = firstMap("one") //Enter key to get the value. Only works this way round.
  println("Get Map Value: " + getMapValue)
  val getMapKey: String = firstMap.find(number => number._2 == 3).get._1 //find the value that is equal to 1 and get the key that matches it. (number => number same as _)
  println("Get Map Key: " + getMapKey)
  val filterMap: Map[String, Int] = firstMap.filter(Num => Num._2 == 3)

  //TASK
  //1. Create a Seq of the names of everybody on the course
  val names: Seq[String] = Seq("Anjali", "Andy", "Chay", "April")
  //2. Create a Map of 1-“red”, 2-“yellow”, 3-“blue”, 4-“green” and play with accessing the elements
  val colours: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4 -> "green")
  val filteredForColourBlue: Map[Int, String] = colours.filter(num => num._1 == 3)
  val filteredForColourBlueV2: Map[Int, String] = colours.filter(num => num._2 == "blue")
  //3. Filter a Set of Ints to only contain Ints higher than 2.
  //  val filterSet = firstSet.filter(_>2)

  // map (method - lowercase 'm')
  // Use a map to iterate (move through) a collection
   val firstSet= Set(1,2,3)
  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map {
    //    _ * 3 - this is the same as below
    number => number * 3
  }

  println("Tripled Set: " + tripledSet(firstSet))

  def tripledSeq(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map {
    //    _ * 3 - this is the same as below
    number => number * 3
  }

  println("Tripled Seq: " + tripledSeq(firstSeq))

  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map {
    case (key, value) => (key, value * 3) //Can also change the key, e.g. key + "s"
  }

  val tripledMapStored = tripledMap(firstMap)
  println("Tripled Map: " + tripledMapStored)

  // .exists = all that could be (get collection back)
  // .contains (check - true/false - boolean)

  //TASK
  //4. Add 1 to all numbers in a collection.
  val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val addOneSeq = numbers.map { number => number + 1 }
  //5. Return true if a Seq has a String that contains the letter “r” .
  val containsLetterR: Boolean = names.exists(name => name.contains("r"))
  //6.Remove all even numbers from a Set.
  val oddNumbersOnly = firstSet.filter {
    number => number % 2 != 0
  } //(could use filterNot == rather than !=) (could replace number => number with _)

  val flatMapNames: Seq[Char] = names.flatMap(_.toUpperCase)
  println("FlatMap: "+ flatMapNames)

  val newSeq: Seq[Int] = Seq(6,7,8)
  //Append - add to end
  val appendedListOne = firstSeq :+ newSeq
  println("Append :+ " + appendedListOne)
  val appendedListTwo = firstSeq ++ newSeq
  println("Append ++ " + appendedListTwo)
  //Prepend
  val prependSeqOne = newSeq ++ firstSeq //ORDER MATTERS!!
  println("Prepend ++ " + prependSeqOne)
  val prependSeqTwo: Seq[Any] = newSeq +: firstSeq //: + swap position
  println("Prepend +: " + prependSeqTwo)
  val prependValue = 6 +: firstSeq
  println(prependValue)

  val prependSpecificReturnType: Seq[Seq[Int]] = newSeq +: Seq(firstSeq)
  val plusOneFlatMap = prependSpecificReturnType.flatMap(_.map(_ + 1)) //flatMap will escape out of the nested list, then we map through to add 1
  println(plusOneFlatMap)
  println(prependSpecificReturnType.flatten)//can use flatten rather than flatMap with nested structures
  //A flatMap basically maps and then flatterns

}










