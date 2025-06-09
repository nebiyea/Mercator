package Automation.Wekk4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import java.time.Duration // ✅ DOĞRU IMPORT BU

object ByID1 extends App {
  val driver: WebDriver = new ChromeDriver()

  try {
    driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

    val wait = new WebDriverWait(driver, Duration.ofSeconds(10)) // ← HATA BITIYOR BURADA

    val emailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
    emailAddress.sendKeys("nebiyearslan@yahoo.com")
    println("E-mail OK.")

    val password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
    password.sendKeys("password123")
    println("PAAWWORD OK .")

    val submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")))
    submit.click()
    println("Login SUCCESFUL!")

  } catch {
    case e: Exception =>
      println(s"ERROR  ${e.getMessage}")
      e.printStackTrace()
  } finally {
    Thread.sleep(3000)
    driver.quit()
  }
}
