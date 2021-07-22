package SeleniumAutoClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	Actions actions = new Actions(driver);
	driver.switchTo().frame(0);
	//actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	actions.clickAndHold(drag).moveToElement(drop).release().perform();
}
	
}
