package SeleniumAutoClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	
	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
	
	//driver.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'eTicket')]")).click();
	//driver.findElement(By.xpath("//a[(text()='eTicket Login')]")).click();
	//driver.findElement(By.xpath("//a[contains(@href,'//agents.apsrtconline.in')]")).click();
	//driver.findElement(By.xpath("//a[starts-with(@href,'//agents.apsrtconline.in')]")).click();
	//driver.findElement(By.xpath("//a[starts-with(text(),'ATB')]")).click();
	driver.findElement(By.xpath("//a[starts-with(@href,'//agents')]")).click();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mahesh");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='submitBtn']")).click();

	//driver.findElement(By.id("userName")).sendKeys("mahesh");
	//driver.findElement(By.id("password")).sendKeys("1234");
	//driver.findElement(By.name("submitBtn")).click();
	
	//*[@id="userName"]
	
	//a[@href='/oprs-web/login/show.do']
	//a[contains(text(),'eTicket' )]
	//a[(text()='eTicket Login' )]
	//a[contains(@href,'//agents.apsrtconline.in')]
	
	//a[starts-with(@href,'//agents.apsrtconline.in')]
	
	//a[starts-with(text(),'ATB')]
	
	//a[starts-with(@href,'//agents')]
}}
