package April

object WedHandling extends App {


  val weather: String = "hot"
  if (weather == "rainy") {
    println("take a coat with a hood")

  } else if (weather == "sunny") {
    println("wear the sun cream")

  } else if (weather == "cold") {
    println("wear warm coat")


    }else{
    println("not a valid")

  }
  //pattern match
  weather match {
    case "rainy" =>  println("wear the sun cream")
    case "sunny" => println("wear the sun cream")
    case "cold" => println("wear warm coat")
    case  _ => println("not a valid")
  }


val season : String= " WINTER"

  // HOW WE APPROACH THIS WHEN HAVE MULTIPLE OPTIONS:
  if ( weather == " cold" || season == "winter "){
    println("Take a coat")
  }else{
    println("an light jacket ")
  }

  (weather, season) match {
    case (weather, seasen) if weather == "cold" || seasen == "winter"
      => println("Take a coat")
    case _ => println(" a lght jacket fine")
  }

  // int - sligtly more careful

  val age: Int = 60

  if (age < 0) {
    println(" enter a postive number")
  } else if (age >= 18) {
      println(s" you are an adult because you are $age")
    } else {
      println(s"Yoe are a child becuse you are $age")
    }

  age match {
    case age if age < 0 => println(" enter a postife number")
    case age if age < 18 => println(s" you are an adult because you are $age")
    case age if age >= 18 => println(s"Yoe are a child becuse you are $age")

  }
  /*val percentage: Int = 103

  if (percentage > 100 || percentage<0)
    else if (percentage>= 90)
      println()
    else if (percentage>= 80)
*/

// Option

val name : Option[String] = Some ("April")
  val  emptyName : Option [String] = None
  println(name)
  println(emptyName)

  def getName(name: Option[String]): String = name.getOrElse("This user hase left the field emty")

  println(getName(name))
  println(getName(emptyName))

  //TRAY /CATCH

  try {
    // all logic - if/else, pattern
    val number = "123".toInt //iwant
    println(s" The number is $number")
  }catch{
    case  error : NumberFormatException => println(s"$error was not a valid input")// often see error as "


  }



}