package Automation.Wekk5Day3
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object Task_Frame extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.manage().window().maximize()

  // 1. W3Schools IFrame sayfası
  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe")
  driver.switchTo().frame("iframeResult") // outside frame
  driver.switchTo().frame(0) //inside iframe
  val iframeText = driver.findElement(By.tagName("h1")).getText
  println("inside iframe  (W3Schools): " + iframeText)
  driver.switchTo().defaultContent()



  driver.quit()
}