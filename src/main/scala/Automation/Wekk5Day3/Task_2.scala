package Automation.Wekk5Day3
import Automation.Wekk5Day3.HabdilingAlert.driver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object Task_2 extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.manage().window().maximize()
  driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php")


  Thread.sleep(2000)

  // 1. Simple Alert
  val simpleBtn = driver.findElement(By.xpath("//button[contains(text(), 'Simple Alert')]"))
  simpleBtn.click()
  Thread.sleep(1000)
  val simpleAlert = driver.switchTo().alert()
  println("Simple Alert: " + simpleAlert.getText)
  simpleAlert.accept()
  println("✔ Test passed for Simple Alert\n")

  // 2. Confirmation Alert
  val confirmBtn = driver.findElement(By.xpath("//button[contains(text(), 'Confirmation Alert')]"))
  confirmBtn.click()
  Thread.sleep(1000)
  val confirmAlert = driver.switchTo().alert()
  println("Confirmation Alert: " + confirmAlert.getText)
  confirmAlert.dismiss()
  println("✔ Test passed for Confirmation Alert\n")

  // 3. Prompt Alert
  val promptBtn = driver.findElement(By.xpath("//button[contains(text(), 'Prompt Alert')]"))
  promptBtn.click()
  Thread.sleep(1000)
  val promptAlert = driver.switchTo().alert()
  println("Prompt Alert: " + promptAlert.getText)
  promptAlert.sendKeys("Selenium ile test")
  Thread.sleep(500)
  promptAlert.accept()
  println("✔ Test passed for Prompt Alert\n")

  Thread.sleep(2000)
  driver.quit()
}
