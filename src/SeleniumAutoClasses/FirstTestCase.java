package SeleniumAutoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstTestCase {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String Source = driver.getPageSource();
		System.out.println(Source);
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	driver.close();
	}

	
	
}
	
