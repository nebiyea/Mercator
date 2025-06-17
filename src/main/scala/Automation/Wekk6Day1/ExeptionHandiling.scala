package Automation.Wekk6Day1

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration
object ExeptionHandiling extends App {
  /*
  //Instantiating the ChromeDriver for interacting with the Chrome browserAdd commentMore actions
  val driver: WebDriver = new ChromeDriver()

  try {
    //Accessing the web url for testing
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1")

    val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3))
    explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")))
  }
    // driver.findElement(By.id("nonexistent-id")).click()

  catch {

    case e: NoSuchElementException =>
      println(" Element not found")
    //   e.printStackTrace()
    //   throw e

    case e: Exception =>
      // print("Print any exception - " +e.getMessage)
      e.printStackTrace()
  }
  finally {

    if(driver != null){
      driver.quit()
    }

  }
  driver.quit()
}
*/
}