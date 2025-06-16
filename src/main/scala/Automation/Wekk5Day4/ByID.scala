package Automation.Wekk5Day4

import Automation.Wekk5Day2.Task3.submitButton
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
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
 //submit.click()

 val js = driver.asInstanceOf[JavascriptExecutor]
 js.executeScript("argumants[0].scrollIntoView(true);", submitButton)
 js.executeScript("arguments[0].click()", submitButton)

 val header= driver.findElement(By.tagName("h2"))
 assert(header== "Thank you")

 println("logged in secces - passed")

  driver.quit()






}
