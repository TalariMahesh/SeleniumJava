package SeleniumAutoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatefun {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.navigate().to("https://www.naukri.com/");
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		driver.close();
		driver.quit();
		
		
	}

}
