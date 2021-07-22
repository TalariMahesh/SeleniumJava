package SeleniumAutoClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	
	driver.findElement(By.xpath("//*[@id='close-fixedban']/img")).click();
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	//span[text()="Practice Form"]
	driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]")).click();
	
	//driver.ReusableMethods.ddElement(webElement, 1 )
	//ele.click();
	
	//WebElement ele = 
	 //Select select = new Select(ele);	 
	// select.selectByIndex(1);
	//dropdown.selectByVisibleText("NCR");
	//dropdown.selectByValue("HARYANA");
	}
	}