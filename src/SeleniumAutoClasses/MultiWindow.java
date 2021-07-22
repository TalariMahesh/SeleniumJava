package SeleniumAutoClasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String currentw= driver.getWindowHandle();
	Set<String> WindowsPOP = driver.getWindowHandles();
	for(String s : WindowsPOP) {
		if(!(s.equals(currentw)))
{
		driver.switchTo().window(s);
		Thread.sleep(1000);
		driver.close();
		}
	}
		
	}
	
		
	
	
}
