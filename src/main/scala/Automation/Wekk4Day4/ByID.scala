package Automation.Wekk4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}


import scala.concurrent.duration.Duration

object ByID extends App {
 // instansting the crome browser
  val driver:WebDriver= new ChromeDriver()
  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

 val emailAddress: WebElement =driver.findElement(By.id("email"))
  println("Email adress enter")
 emailAddress.sendKeys("nebiyearslan@yahoo.com")

 //val wait = new WebDriverWait(driver, Duration.ofSeconds(10))



  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("password123")
  println("Password enetered ")



 val submit: WebElement = driver.findElement(By.id("login"))
 submit.click()
 println("logged in secces - passed")

  driver.quit()






}
