package Automation.Week5Day6

import Automation.Wekk5Day2.Task3.submitButton
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

import java.time.Duration

object JavaScriotExecuter extends App{

  val driver:WebDriver= new ChromeDriver()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  val emailAddress: WebElement =driver.findElement(By.id("email"))
  println("Email adress enter")
  emailAddress.sendKeys("nebiyearslan@yahoo.com")
  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("password123")
  println("Password enetered ")


  //Not working currently - don't know enough yet. (Might need to wait.)
  val login: WebElement = driver.findElement(By.id("login")) //find submit button through id
   login.click() //click the button - not needed when using javaScript

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("argumants[0].scrollIntoView(true);", submitButton)
  js.executeScript("arguments[0].click()", submitButton)
  println("Login succesful")


  val header= driver.findElement(By.tagName("h2")).getText
  println("Header: " + header)
  //Assertions are used to make sure script is behaving as expected
  assert(header == "Thank You!") //should pass
  //  assert(header == "I'm wrong") //should fail


  driver.quit()



}
