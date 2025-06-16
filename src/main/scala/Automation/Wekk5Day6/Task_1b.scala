package Automation.Wekk5Day6


import scala.jdk.CollectionConverters.CollectionHasAsScala
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import java.time.Duration

object Task_1b extends App {
/*2. Static Table Handling
• Locate the table containing country data.
• Extract and print all country names from the first column.
• Use JavaScript Executor to highlight each row as it’s read.
3. Implicit Wait
• Set a global implicit wait of 10 seconds.
4. Explicit Wait
• Wait for a specific country row (e.g., "Germany") to be visible.
• Once visible, extract its capital and currency.
Extension:
Continue with the above script and add in:
1. JavaScript
  */
  val driver: WebDriver = new ChromeDriver()
  val js = driver.asInstanceOf[JavascriptExecutor]
  driver.get("https://cosmocode.io/automation-practice-webtable/")
  driver.manage().window().maximize()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

  val countries = driver.findElement(By.id("countries"))
  js.executeScript("arguments[0].scrollIntoView(true);", countries)//Scroll to the table using JS
  allCoutryName()



def allCoutryName(): Unit={
  val countryElements = driver.findElements(By.xpath("//table[@id='countries']//strong")).asScala
  println("all country / :")
  for (element <- countryElements) {
    // 💡 Highlight the current element by changing background color
    js.executeScript("arguments[0].style.backgroundColor='yellow'", element)
    println(element.getText)
  }
  germanyDetails()
  def germanyDetails() :Unit= {
    val germanyRow = driver.findElement(By.xpath("//td[strong[text()='Germany']]/parent::tr")) // // Find the row for Germany
    val capital = germanyRow.findElement(By.xpath("./td[3]")).getText // Get the 3rd column (capital)
    val currency = germanyRow.findElement(By.xpath("./td[4]")).getText// Get the 4th column (currency)


    println("\nGermany Details:")
    println(s"country: Germany")
    println(s"Cabital: $capital")
    println(s"currency: $currency")


  }



  }
driver.quit()
}


