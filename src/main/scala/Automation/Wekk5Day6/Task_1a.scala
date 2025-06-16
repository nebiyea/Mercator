package Automation.Week5Day6
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import java.time.Duration
object
Task_1a extends App {


    val driver: WebDriver = new ChromeDriver()
    driver.get("https://cosmocode.io/automation-practice-webtable/")
    driver.manage().window().maximize()
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) // Implicit Wait


    val countries = driver.findElement(By.id("countries"))
    val rows = countries.findElements(By.tagName("tr"))
    val js = driver.asInstanceOf[JavascriptExecutor]

    for (i <- 1 until rows.size()) {
      val cells = rows.get(i).findElements(By.tagName("td"))
      if (cells.size() > 0) {
        js.executeScript("arguments[0].style.backgroundColor ='red'", rows.get(i)) // Highlight


        val countryName = cells.get(0).getText
        println(cells.get(1).getText)


        if (countryName.equalsIgnoreCase("Germany")) {
          val capital = cells.get(1).getText

          val currency = cells.get(3).getText
          println(s" Germany FOUND → Capital: $capital | Currency: $currency")


          val js = driver.asInstanceOf[JavascriptExecutor]
          js.executeScript("argumants[0].scrollIntoView(true);", countryName)
          js.executeScript("arguments[0].click()", currency)
          println("")

        }
      }
    }

    driver.quit()




}

