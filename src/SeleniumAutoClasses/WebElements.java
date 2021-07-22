package SeleniumAutoClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	private static final By By = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(org.openqa.selenium.By.id("email")).sendKeys("9160780569"); 
		driver.findElement(org.openqa.selenium.By.name("pass")).sendKeys("talari");
		
		
	}

}
