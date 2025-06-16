package Automation.Wekk5Day2

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object Task1 extends App {

  val driver: WebDriver = new ChromeDriver() //1. Launch the browser using WebDriver
  driver.get("https://demoqa.com/browser-windows") //2. Navigate to the test URL.
  println("navigate page")


  println("Page Title: " + driver.getTitle) // Page title
  println("Current URL: " + driver.getCurrentUrl) // Current URL

  driver.close()

  // 5. End the session
  driver.quit()
  
}
