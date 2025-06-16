package Automation.Week5Day6

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandleWindows extends App{


  val driver:WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/windows")
   driver.manage().window().maximize()


  val parentWindow = driver.getWindowHandle()
  println(" handle for the parrent window" + parentWindow)

  driver.findElement(By.linkText("Click here"))
  val allWindow:List[String]= driver.getWindowHandles.asScala.toList
  val it = allWindow.iterator

  while (it.hasNext) {
    val handle = it.next()

    if (handle != parentWindow) {
      driver.switchTo().window(handle)
      println("The current window" + handle)
      println("get title " + driver.getTitle)
    }
  }

  // Switch back to parent window
  driver.switchTo().window(parentWindow)
  println("Switched back to Parent Window")





driver.quit()

}
