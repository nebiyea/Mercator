package Automation.Wekk6Day1

import Automation.Wekk6Day1.SvreenCapture.{driver, screenshotsDir}
import Automation.Wekk6Day1.Task_1.driver
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.WebDriverWait

import java.io.File
import sun.jvm.hotspot.HelloWorld.e

import java.io.ObjectInputFilter.Status
import java.text.SimpleDateFormat
import java.util.Date
import scala.concurrent.duration.Duration

object Task_1 extends App {

  val option = new ChromeOptions()
  option.addArguments("--headless=new")  //1. Use ChromeDriver with `--headless=new option`


  val driver: WebDriver = new ChromeDriver(option)


  try {
    val screenshotsDir = new File("/Users/nebiye.arslan/Documents/Screenshot")
    screenshotsDir.mkdirs() // open new file
    driver.get(" https://the-internet.herokuapp.com/login") //2. Navigate to the login URL - https://the-internet.herokuapp.com/login
    driver.manage().window().maximize()

    val username: WebElement = driver.findElement(By.xpath("//*[@id=\"username\"]"))
    username.sendKeys("tomsmith")

    val password: WebElement = driver.findElement(By.xpath("//*[@id=\"password\"]")) //b. Password: SuperSecretPassword!
    password.sendKeys("SuperSecretPassword!")

    val loginButton: WebElement = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")) //3. Submit the login form.
    loginButton.click()

    //val flashMsg = driver.findElement(By.id("flash"))
    //println("Login button: " + flashMsg.getText) // allert //4. Wait for the result message (success or failure).
    val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)// SCREENSHOT
    FileHandler.copy(srcFull, new File("/Users/nebiye.arslan/Documents/Screenshot/TestResults.png"))

    // 6. Timestamp oluştur ve ekrana yazdı
    val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
    println(s"Timestamp: $timeStamp")

    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"/Users/nebiye.arslan/Documents/Screenshot/TestResult_$timeStamp.png"))

    // 7. Timestamp'li screenshot al
    val element = driver.findElement(By.name("my-disabled")) // Locate the element by its name (update if needed)
    val srcElement: File = element.getScreenshotAs(OutputType.FILE) // Capture only that element// Save the screenshot of the element
    FileHandler.copy(srcElement, new File("/Users/nebiye.arslan/Documents/Screenshot/TestResult_Specific.png"))
    screenshotsDir.mkdirs() // Create screenshots directory

  } catch {
    case e: NoSuchElementException =>
      println("Element not found")
    case e: Exception =>
      println("error " + e.getMessage)
      e.printStackTrace()
  } finally {
    if (driver != null) {
      driver.quit()
    }
  }
}
