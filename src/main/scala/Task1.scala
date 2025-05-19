object Task1 extends App {

  val result =(3 + 4) * 57< 300
  println(result)

  val apple = (144 / 12) > 12 || (144 / 12)== 12
  println(apple)

  val tex= "Cat" < "Dog"
  println(tex)

  val tex1= "Rabbit" < "Hamster"
  println(tex1)

  val mod = 17 % 2 != 0
  println(mod)

  val div = (75 / 9) < 30 && (89 / 6) < 20
  println(div)

  val text = "I love scala already" // String variable
  println("I love scala already")// ptinting to the  screen
  println(text) //  to printing variable

  def square (x: Int): Int = x * x
  println(square(5))
  println(square(3))


  def isOdd (n: Int): Boolean = {
    n % 2 != 0

  }
  println(isOdd(5))
  println(isOdd(8))
  println(isOdd(7))

  class Book(
              val Title: String,
              val Author:String,
              val Year:Int,
              val Pages:Int,
            ) {

    private var isAvalable: Boolean = true

    def borrow(): Unit = {
      isAvalable = false
    }

    def returnBook(): Unit = {
      isAvalable = true
    }

    def printDetails():Unit ={
      println(s"Title: $Title")
      println(s"Author: $Author")
      println(s"Year: $Year")



    }
  }




  }


