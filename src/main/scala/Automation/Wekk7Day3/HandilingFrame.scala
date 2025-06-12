package Automation.Wekk7Day3
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver


object HandilingFrame extends App {


  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/nested_frames")
  driver.manage().window().maximize()

  // === Frame -> Top -> Middle ===
  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-middle")

  val middleText = driver.findElement(By.id("content")).getText
  println("Middle Text = " + middleText)

  // === Back to Default Content ===
  driver.switchTo().defaultContent()

  // === Frame -> Bottom ===
  driver.switchTo().frame("frame-bottom")
  val bottomText = driver.findElement(By.tagName("body")).getText
  println("Bottom Text = " + bottomText)

  // === Back to Default Content again ===
  driver.switchTo().defaultContent()

  // === Frame -> Top -> Left ===
  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-left")

  val leftText = driver.findElement(By.tagName("body")).getText
  println("Left Text = " + leftText)

  // === Clean up ===
  driver.quit()

}