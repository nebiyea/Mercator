package Automation.Wekk7Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandilingButtonsAndLink extends App{
 val driver: WebDriver = new ChromeDriver() //1. Launch the browser using WebDriver
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  driver.manage().window().maximize()

  val button = driver.findElement(By.cssSelector("[type=\"submit\"]"))
  if (button.isEnabled){
    println("Button text:" + button.getText)
    button.click()

    }else {
    println("button  is not enabled")
  }

  driver.get("https://www.selenium.dev/")
  val myLink = driver.findElement(By.linkText("Documentation"))
  println("Get 'href' attribute for destination url: " + myLink.getAttribute("href"))




  driver.quit()
}
