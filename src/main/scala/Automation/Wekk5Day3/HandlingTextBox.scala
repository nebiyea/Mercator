package Automation.Wekk5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingTextBox extends App{

  val driver: WebDriver = new ChromeDriver() //1. Launch the browser using WebDriver
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val text= driver.findElement(By.id("my-text-id"))


val textInput = driver.findElement(By.id("my-text-id"))
  println("Text sent to text box: " + textInput.sendKeys("Welcome"))
  println("getAttribute: "+ textInput.getAttribute("type"))
  println("getAttribute: "+ textInput.getAttribute("value"))
  println("Text cleared: " +  textInput.clear())





  driver.close()



}
