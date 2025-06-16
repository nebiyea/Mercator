package Automation.Wekk5Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
  import org.openqa.selenium.chrome.ChromeDriver
  import scala.jdk.CollectionConverters._
/*1.	Using this link: https://www.w3schools.com/html/html_examples.asp

  Write a program to:
    a)	Identify Button Elements
  b)	Identify Image Elements
  c)	Count how many of a specific element (e.g., <h1> or <a>) exist on the page
    d)	Use a loop to identify multiple types of tags (like p, a, h1, button)
    e)	Use a loop to find the count of hyperlinks on a page?*/


  object HtmlElementsDemo extends App {
    val driver: WebDriver = new ChromeDriver()
    driver.get("https://www.w3schools.com/html/html_examples.asp")

    val buttons = driver.findElements(By.tagName("button")).asScala
    println(s"Button count: ${buttons.size}")

    val images = driver.findElements(By.tagName("img")).asScala
    println(s"Image count: ${images.size}")

    val h1Elements = driver.findElements(By.tagName("h1")).asScala
    println(s"<h1> count: ${h1Elements.size}")

    val tags = Seq("p", "a", "h1", "button")
    tags.foreach { tag =>
      val elements = driver.findElements(By.tagName(tag)).asScala
      println(s"<$tag> count: ${elements.size}")
    }

    val links = driver.findElements(By.tagName("a")).asScala
    println(s"Hyperlink (<a>) count: ${links.size}")

    driver.quit()


}
