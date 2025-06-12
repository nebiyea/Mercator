package Automation.Wekk7Day3
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import java.time.Duration

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HabdilingAlert extends App{

    val driver: WebDriver = new ChromeDriver()
    driver.get("https://the-internet.herokuapp.com/javascript_alerts")
    driver.manage().window().maximize()



    // 1. Simple Alert
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click()
    val simpleAlert = driver.switchTo().alert()
    println("Alert 1 Text: " + simpleAlert.getText)
    simpleAlert.accept()
    println("Test passed for Simple Alert\n")

    // 2. Confirmation Alert
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click()
    val confirmAlert = driver.switchTo().alert()
    println("Alert 2 Text: " + confirmAlert.getText)
    confirmAlert.accept() // veya confirmAlert.dismiss()
    println("Test passed for Confirmation Alert\n")

    // 3. Prompt Alert
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click()
    val promptAlert = driver.switchTo().alert()
    println("Alert 3 Text: " + promptAlert.getText)
    promptAlert.sendKeys("WE COME MERCATOR")
    promptAlert.accept()
    println("Prompt Alert accepted\n")

    driver.quit()
  }
