package Automation.Wekk5Day5
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import scala.jdk.CollectionConverters._
import scala.jdk.CollectionConverters.CollectionHasAsScala
import scala.sys.process.BasicIO.input

object Locator_Css extends App {


  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  val username: WebElement = driver.findElement(By.cssSelector("input[name='username']"))
  username.sendKeys("Nebiye") //o One must use `cssSelector`
  println("Locator: css")


  val password: WebElement = driver.findElement(By.name("password")) //o One must use `name`
  password.sendKeys("neb123")
  println("locator: name")


  val textarea: WebElement = driver.findElement(By.xpath("//textarea[@name='comments']"))
  textarea.clear()
  textarea.sendKeys("Welcome scala") //One must use `xpath`
  println("Locator: xpath")


  val file: WebElement = driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(4) > td > input[type=file]:nth-child(2)"))
  val filepath = "/Users/nebiye.arslan/Desktop/locatr"
  file.sendKeys(filepath)
  println("file upload: and Long css")


  val checkboxes: java.util.List[WebElement] = driver.findElements(By.tagName("input"))
  checkboxes.forEach { checkbox =>
    if (checkbox.getAttribute("type") == "checkbox" && !checkbox.isSelected) { //o One must use `tagName`
      checkbox.click()

      println("locater tagname")
    }

  }
  val radioButtons = driver.findElements(By.xpath("//input[@type='radio' and @name='radioval']")).asScala

  radioButtons.take(1).foreach { radio =>
    if (!radio.isSelected()) {
      radio.click()
      println(s"Clicked radio with value: ${radio.getAttribute("value")}")
    }

  }

  val selects = driver.findElements(By.tagName("select")).asScala.distinct

  selects.headOption.foreach { select =>
    val options = select.findElements(By.tagName("option")).asScala
    options.zipWithIndex.foreach { case (opt, i) =>
      println(s"  Index $i: ${opt.getText.trim}")
      println("locator: tagName")


    }



  val dropdown = new Select(driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(8) > td > select")))
  dropdown.selectByVisibleText("Drop Down Item 3")
  println("Selected: Drop Down Item 3")
  println("Locator: cssSelector")

}

val submit: WebElement=driver.findElement(By.className("styled-click-button"))
  submit.click()
  println("Locator: Class name ")



    driver.quit()



}