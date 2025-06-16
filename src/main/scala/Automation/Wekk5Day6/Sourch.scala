package Automation.Week5Day6
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import java.time.Duration
object Sourch extends App {




  /*
  * 1-click()	Performs a single mouse click on an element	Clicking buttons, checkboxes, or links
  * new Actions(driver).click(driver.findElement(By.id("submitBtn"))).perform()
  *
  * 2-doubleClick()	Performs a double-click	Selecting items in a list or opening files/folders
  * new Actions(driver).doubleClick(driver.findElement(By.id("fileItem"))).perform()
  *
  * 3- contextClick()	Performs a right-click (context menu)	Opening context menus for elements
  * new Actions(driver).contextClick(driver.findElement(By.id("menuOption"))).perform()
  * 4-moveToElement(element)	Moves the mouse to hover over an element	Hovering to reveal dropdowns or tooltips
  * new Actions(driver).moveToElement(driver.findElement(By.id("hoverMenu"))).perform()
  *
  * 5-dragAndDrop(src, dest)	Drags an element and drops it onto another	Drag-and-drop actions (e.g., reordering lists)
  *.dragAndDrop(driver.findElement(By.id("dragMe")), driver.findElement(By.id("dropHere")))
  .perform()
  *val actions = new Actions(driver)
  val source = driver.findElement(By.id("draggable"))
  val target = driver.findElement(By.id("droppable"))
  actions.dragAndDrop(source, target).perform()
  * 6-
  *
  *
  *
  * -9 moveToElement()	Moves to center of a specific element	Hover over menus
Method	Description	Example Use Case
moveToElement()	Moves to center of a specific element	Hover over menus
moveByOffset(x,y)	Moves cursor by (x, y) from current mouse position=	Drag a slider, or canvas interaction
actions.moveToElement(menuElement).click().perform()
actions.moveByOffset(100, 50).click().perform()
*
* 10- actions.moveToElement(mainMenu)
       .moveToElement(subMenu)
       .click()
       .perform()
  * */

}
