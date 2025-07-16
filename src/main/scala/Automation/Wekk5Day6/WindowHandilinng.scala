package Automation.Wekk5Day6

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import scala.jdk.CollectionConverters.CollectionHasAsScala

object WindowHandilinng extends App{

  val driver:WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val pparentWindow = driver.getWindowHandle
  println(" wintows handle" + pparentWindow)

  driver.findElement(By.linkText("Click Here")).click()
  val allWindows : List[String] = driver.getWindowHandles.asScala.toList

  val it = allWindows.iterator
  while (it.hasNext){
    val handle = it.next()
    if (handle != pparentWindow){
      driver.switchTo().window(handle)
      println("title " + driver.getTitle)
      driver.close()
    }


  }
driver.switchTo().window(pparentWindow)


  driver.close()
}
