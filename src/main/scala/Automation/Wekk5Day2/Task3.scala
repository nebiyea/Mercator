package Automation.Wekk5Day2

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}

object Task3 extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.manage().window().maximize()
  driver.get("https://demoqa.com/automation-practice-form")
  println("Sayfaya gidildi.")

  val js = driver.asInstanceOf[JavascriptExecutor]// // Scroll aşağı, reklamların engellememesi için
  js.executeScript("window.scrollBy(0, 500)")


  val firstNameInput = driver.findElement(By.id("firstName"))//
  val submitButton = driver.findElement(By.id("submit"))
  val hobbiesLabel = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"))


  if (firstNameInput.isDisplayed && firstNameInput.isEnabled) { // 4
    firstNameInput.sendKeys("NEBIYE")
    println("NAME IS HERE.")
  }


  val checkbox = driver.findElement(By.id("hobbies-checkbox-1"))// Checkbox kontrolü (label’e tıklıyoruz çünkü input arkada k
  if (!checkbox.isSelected) {
    hobbiesLabel.click()
    println("Checkbox.")
  }

  // Submit butonu kontrol
  if (submitButton.isDisplayed && submitButton.isEnabled) {
    submitButton.click()
    println("Form gönderildi.")
  }

  // Tarayıcıyı kapat
  driver.quit()
}
