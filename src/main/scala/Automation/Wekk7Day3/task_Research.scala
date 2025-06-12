package Automation.Wekk7Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object task_Research extends App{
/*

1.file upload
val uploadElement = driver.findElement(By.id("uploadFile"))
uploadElement.sendKeys("/Users/kullaniciAdi/Downloads/test.txt")
or
you can use path root


2.scroll down
val js = driver.asInstanceOf[JavascriptExecutor]
js.executeScript("window.scrollTo(0, document.body.scrollHeight);")

3.Dynamic Dropdown Nedir?
// Bekle dropdown'ın gelmesini
  val wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5))
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[role='listbox']")))

  // Dropdown'daki tüm önerileri al
  val suggestions = driver.findElements(By.cssSelector("li span")).asScala

4.Shadow DOM Nedir?
<custom-component>
  #shadow-root
    <input type="text">
</custom-component>


  val shadowHost = driver.findElement(By.cssSelector("custom-component"))
val js = driver.asInstanceOf[JavascriptExecutor]
val shadowRoot = js.executeScript("return arguments[0].shadowRoot", shadowHost)
val input = shadowRoot.asInstanceOf[SearchContext].findElement(By.cssSelector("input"))
input.sendKeys("test")



  driver.quit()
  */
}


