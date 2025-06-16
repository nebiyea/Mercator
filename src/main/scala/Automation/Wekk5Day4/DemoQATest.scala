package Automation.Wekk5Day4

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object DemoQATest extends App {
  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/text-box")

  // a) Full Name input field with no id or name missing name Atriputes
  val fullName = driver.findElement(By.cssSelector("input[placeholder='Full Name']"))
  fullName.sendKeys("Nebiye Arslan")

  // b) Header with whitespace
  val textBoxHeader = driver.findElement(By.xpath("//*[normalize-space(text())='Text Box']"))
  println(textBoxHeader.getText)

  // c) Hidden output box after submit
  val submit = driver.findElement(By.id("submit"))
  submit.click()

  val outputBox = driver.findElement(By.id("output"))
  println("Output displayed: " + outputBox.isDisplayed)

  driver.quit()


}
