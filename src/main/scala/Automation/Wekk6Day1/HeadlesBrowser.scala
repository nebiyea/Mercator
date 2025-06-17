package Automation.Wekk6Day1

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

object HeadlesBrowser extends App {
  val option= new ChromeOptions()
  option.addArguments("--Headles")


  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/javascript_alerts")
  driver.manage().window().maximize()








  driver.quit()
}
