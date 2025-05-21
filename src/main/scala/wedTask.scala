object wedTask extends App {

  /*val watermelons: Int = 6

  if (watermelons < 0) {
    println("Invalid number of watermelons.")
  } else if (watermelons <= 3) {
    println("John doesn't need a bag.")
  } else if (watermelons <= 5) {
    println("John needs a bag.")
  } else {
    println("John can't carry that many watermelons.")
  }


  watermelons match {
    case 0 => println("Invalid number of watermelons.")
    case 1 => println("John doesn't need a bag.")
    case 2 => println("John doesn't need a bag.")
    case 3 => println("John doesn't need a bag.")
    case 4 => println("John needs a bag.")
    case 5 => println("John needs a bag.")
    case _ => println("John can't carry that many watermelons1.")
  }
  //val watermelons: Int = 6

  // d) John'un yanında çantası var mı?
  val hasBag: Boolean = true  // Örnek olarak çanta var

  // 2) Mesajlarda string interpolation kullanımı
  val message = watermelons match {
    case n if n < 0 => s"Invalid number of watermelons: $n."
    case n if n <= 3 => s"John doesn't need a bag for $n watermelons."
    case n if n <= 5 => s"John needs a bag for $n watermelons."
    case n => s"John can't carry $n watermelons."
  }

   */
  val watermelons: Int = 6 // 1.a) Create a value to store the number of watermelons John wants to buy

  val hasBag: Boolean = true // d) Create a Boolean to indicate whether

  // 1.b & 2) Print appropriate messages using string interpolation
  val message = if (watermelons < 0) { // Handle invalid number of watermelons
    s"Invalid number of watermelons: $watermelons. Please enter a positive number."
  } else if (watermelons <= 3) {
    s"John doesn't need a bag to carry $watermelons watermelons."
  } else if (watermelons <= 5) { // He needs a bag for 4 or 5 watermelons
    s"John needs a bag to carry $watermelons watermelons."
  } else {
    // More than 5 is too much even with a bag
    s"John can't carry $watermelons watermelons, even with a bag." // More than 5 is too much even with a bag
  }

  println(message)
  // e) Use if-else with the hasBag value to check if John can buy the desired number
  if (watermelons < 0) {
    println("John cannot buy an invalid number of watermelons.")
  } else if (watermelons <= 3) {
    println("John can buy the watermelons without a bag.")
  } else if (watermelons <= 5 && hasBag) {
    println("John can buy the watermelons because he has a bag.")
  } else {
    println("John cannot buy that many watermelons.")
  }

  import scala.io.StdIn.readLine //Q2

  val ratePerMile: Double = 0.45
  println("Please enter the number of miles you have travelled:")

  val inputMiles: String = readLine() // Read input as string
  try {
    val milesTravelled = inputMiles.toDouble // Try to parse and calculate payment

    if (milesTravelled < 0) {
      println(s"Invalid number of miles: $milesTravelled. Please enter a non-negative value.")
    } else {
      val payment = milesTravelled * ratePerMile
      println(f"You travelled $milesTravelled%.2f miles, so you're owed £$payment%.2f.")
    }

  } catch {
    case e: NumberFormatException =>
      println(s"Invalid input: '$inputMiles'. Please enter a valid numeric value.")
  }
  // 1. Expression: true || false && false
  val result1 = true || false && false// Expected: true (because && is evaluated before ||)
  println(s"true || false && false = $result1")
  // 2. Expression: (true || false) && false
  // Expected: false (because parentheses change the order)
  val result2 = (true || false) && false// Expected: false (because parentheses change the order)
  println(s"(true || false) && false = $result2")
  // 3. Expression: 1 < 4 && 7 != 10 || 9 + 10 == 21
  // Breakdown:
  // - 1 < 4       → true
  // - 7 != 10     → true
  // - true && true → true
  // - 9 + 10 == 21 → true
  // - true || true → true
  val result3 = 1 < 4 && 7 != 10 || 9 + 10 == 21
  println(s"1 < 4 && 7 != 10 || 9 + 10 == 21 = $result3")


  // --- Explanation ---
  // In Scala, if statements always return a value.
  // This means we can assign the result of an if statement directly to a variable.
  // If you want to learn more, official Scala docs or trusted tutorials are great places to start.

  // --- Task ---
  // 1) Create two integer values (you can pick any numbers).
  // 2) Create a String value that holds "yes" if the first integer is greater than the second,
  //    and "no" otherwise.

  // Step 1: Create two integer values
  val firstNumber = 15  // You can change this number as you like
  val secondNumber = 20 // You can change this number as you like
  val comparisonResult: String = if (firstNumber > secondNumber) "yes" else "no"// Step 2: Use if "yes" or "no"
  // Step 3: Print the result using string interpolation
  println(s"Is the first number greater than the second? $comparisonResult")



}

