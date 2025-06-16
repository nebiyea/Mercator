package Automation.Week5Day6

import Automation.Week5Day6.ExplicitWait.explicitWait
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration

object ExplicitWait extends App {
  val driver:WebDriver = new ChromeDriver()
  driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp")
  driver.manage().window().maximize()


  val explicitWait = new WebDriverWait(driver,Duration.ofMinutes(1))

  val checkBox = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[3]/div[2]/label[1]")))
  println("Checkbox found")

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", checkBox)
  js.executeScript("arguments[0].click();", checkBox) //button must be clicked in javaScript
  //  checkBox.click()
  println("Checkbox clicked.")


  driver.quit()



}
