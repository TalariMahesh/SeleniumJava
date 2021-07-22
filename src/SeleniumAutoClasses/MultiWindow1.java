package SeleniumAutoClasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow1 {
	public static void main(String args[]) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> WindowsPOP = driver.getWindowHandles();
		for(String s : WindowsPOP) {
			driver.switchTo().window(s);
			//if(driver.getTitle.equals("JP Morgan"))
			if(driver.getCurrentUrl().equals("https://company.naukri.com/popups/jpmorgan/8jun2021/index.html")) {
				Thread.sleep(1000);
				driver.close();
				
			}
		}
			
			}
			
		}
		
