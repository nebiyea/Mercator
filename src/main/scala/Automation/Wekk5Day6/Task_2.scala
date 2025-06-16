package Automation.Wekk5Day6
import org.openqa.selenium._
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import java.time.Duration
import scala.jdk.CollectionConverters._
import org.openqa.selenium.WebDriver

object Task_2 extends App {

  /*
2. Fluent Wait
• Use Fluent Wait to wait for a specific row (e.g., "India") to become visible.
• Set polling every 500ms, timeout after 15 seconds.
3. Table Validation
• Write a test that verifies if a specific language (e.g., "French") is listed in the table.
• Highlight the corresponding row if found.*/

  val driver: WebDriver = new ChromeDriver()
  val js = driver.asInstanceOf[JavascriptExecutor]
  driver.get("https://cosmocode.io/automation-practice-webtable/")
  driver.manage().window().maximize()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

  val countries = driver.findElement(By.id("countries"))
  js.executeScript("arguments[0].scrollIntoView(true);", countries) //Scroll to the table using JS
  allCoutryName()

  def allCoutryName(): Unit = {
    val countryElements = driver.findElements(By.xpath("//table[@id='countries']//strong")).asScala
    println("All country names:")
    for (element <- countryElements) {
      js.executeScript("arguments[0].style.backgroundColor='yellow'", element) // highlight each row
      println(element.getText)
    }

    germanyDetails()

    def germanyDetails(): Unit = {
      val germanyRow = driver.findElement(By.xpath("//td[strong[text()='Germany']]/parent::tr"))
      val capital = germanyRow.findElement(By.xpath("./td[3]")).getText
      val currency = germanyRow.findElement(By.xpath("./td[4]")).getText

      println("\nGermany Details:")
      println(s"Country: Germany")
      println(s"Capital: $capital")
      println(s"Currency: $currency")
    }

    //  2. Fluent Wait - wait for "India" to become visible
    val wait = new FluentWait(driver)
      .withTimeout(Duration.ofSeconds(15))
      .pollingEvery(Duration.ofMillis(500))
      .ignoring(classOf[NoSuchElementException])

    val indiaRow = wait.until(driver => driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[78]/td[2]")))
    js.executeScript("arguments[0].style.backgroundColor='orange'", indiaRow)
    println("\n India row is visible and highlighted!")

    // 3. Table Validation – check if "French" is listed
    val languageCells = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[71]/td[5]")).asScala
    var frenchFound = false
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
    for (cell <- languageCells) {
      if (cell.getText.trim.equalsIgnoreCase("French")) {
        js.executeScript("arguments[0].style.backgroundColor='Darkgreen'", cell)
        println(" French language found and highlighted!")
        frenchFound = true
      }
    }

    if (!frenchFound) {
      println(" French language not found in the table.")
    }
  }

  driver.quit()

}