package Automation.Wekk5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object HandilingRadioButton extends App{



  val driver: WebDriver = new ChromeDriver() //1. Launch the browser using WebDriver
  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")
  driver.manage().window().maximize()

driver.switchTo().frame("iframeResult")
val drobdown = driver.findElement(By.id("cars"))
  val select = new Select(drobdown)

  select.selectByVisibleText("Opel")
  println(" selcdet by visible Text" + select.getFirstSelectedOption.getText)
  select.selectByValue("volvo")
  println(" selcdet by velu" + select.getFirstSelectedOption.getText)


  //select.deselectByIndex(3)
  //println(" selcdet by Intext" + select.getFirstSelectedOption.getText)

driver.quit()
}
