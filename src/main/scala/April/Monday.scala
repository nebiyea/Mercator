package April

object Monday extends App {
    //VAL = BEST PRACTICE!!
    val melons = 5 * 50
    val apples = 2 * 10
    val fizzyDrink = 6 * (100 * 1.20)
    //  val total = melons + apples + fizzyDrink

    //VAR - mutable (not best practice)
    var total: Double = 0
    total = total + apples
    println(total)
    total = total + melons
    println(total)
    total = total + fizzyDrink
    println(total)

    println(melons)
    println(apples)
    println(fizzyDrink)
    println(total)

    //TYPES
    val wholeNumber: Int = 6483
    val littleNumber: Short = 68 // RARE - JUST USE INT
    val bigNumber: Long = 354748462538498L //MUST PUT L
    val littleDecimal: Float = 2.464748f //MUST PUT f (RARE)
    val decimal: Double = 46465.936 //USE THIS!!
    val text: String = "Hello world!"
    val trueFalse: Boolean = true //false
    val falseTrue: Boolean = true
    println(trueFalse == falseTrue)

    //OPERATORS

    val a: Int = 10
    val b: Int = 5
    val c: Int = 3

    val add: Int = a + b
    println(add)
    val subtract: Int = a - b
    val divide: Double = a / c
    val multiply:Int = a * b
    val modulus: Int = a % c // 10 % 3 (what is the remainder)
    println(modulus)
    val even: Int = a % 2 //left with 0 = even
    println(even)

    //Relational
    val equality: Boolean = a == a // true/false
    println(equality)
    val inequality: Boolean = a != b // NOT EQUAL TO
    val lessThan: Boolean = b<c
    val lessThanEqualTo: Boolean = b<=c
    val greaterThan: Boolean = b>c
    val greaterThanEqualsTo: Boolean = b>=c

    //LOGICAL
    val and: Boolean = true && true //both must be true to return true
    val or: Boolean = true || false //either side can be true to return true
    val not: Boolean = !false

  // methods
  def makeACupOfTea(suger:Int, milk:Boolean)={
    s"You have made a cup of tea $suger spoons of " +
      s"suger.Your milk selection is : $milk"
  }
  println(makeACupOfTea(7, milk = true))

  val vat: Double = 1.2
  def priceWithVat(price: Double) : Double = {
    price * vat
  }

  println(makeACupOfTea(7, milk = true))
  /// classes
  class D0g(val name: String, val age:Int,val likesBananas:Boolean) {


  }


  def speak: String = "woof" // declared in  advance as it
  //isthe same for every Dog

  }

// use the class to make object(e.g. Dog)
// Object of type Dog

//



