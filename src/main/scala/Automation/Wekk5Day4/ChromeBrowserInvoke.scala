package Automation.Wekk5Day4

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver


object ChromeBrowserInvoke extends App {
  val driver: WebDriver = new ChromeDriver()
  println("invoking Chrome Browser")

  driver.get("https://www.google.com/")
  println(" Title at the page:" + driver.getTitle)

  driver.quit()






}
