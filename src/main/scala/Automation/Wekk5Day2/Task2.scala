package Automation.Wekk5Day2

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object Task2 extends App{


  val driver: WebDriver = new ChromeDriver() //1. Launch the browser using WebDriver
  driver.get("https://demoqa.com/browser-windows") //2. Navigate to the test URL.
  println("navigate page")


      driver.get("https://example.com")// 2
      Thread.sleep(2000)
      println("link")


      driver.navigate().back()
      Thread.sleep(2000)//3
  println("Navigate")


      driver.navigate().forward()//4
      Thread.sleep(2000)
  println("Navigate +  forward")



      driver.navigate().refresh()//5
      Thread.sleep(2000)
  println("refresh")

      driver.manage().window().maximize()//6
      Thread.sleep(1000)
      println("maximize")

      println(driver.getPageSource.take(300))//7
  println("get the Html")




      driver.quit()
    }

