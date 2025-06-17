package Automation.Wekk6Day1
import java.io.File
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.io.FileHandler

import java.util.Date
import java.text.SimpleDateFormat

object SvreenCapture extends App {



  val driver: WebDriver = new ChromeDriver()
  val screenshotsDir = new File("screenshots")
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/nebiye.arslan/Documents/Screenshot/TestResults.png"))

  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/nebiye.arslan/Documents/Screenshot/TestResult_$timeStamp.png"))

  val element = driver.findElement(By.name("my-disabled")) // Locate the element by its name (update if needed)
  val srcElement: File = element.getScreenshotAs(OutputType.FILE) // Capture only that element// Save the screenshot of the element
  FileHandler.copy(srcElement, new File("/Users/nebiye.arslan/Documents/Screenshot/TestResult_Specific.png"))
  screenshotsDir.mkdirs() // Create screenshots directory

  driver.quit()

}
