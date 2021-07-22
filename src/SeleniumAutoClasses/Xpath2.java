package SeleniumAutoClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	

	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
	
	List<WebElement> element	=	driver.findElements(By.xpath("//div[@class='menu']/a"));
	System.out.println(element.size());
		
	for (WebElement link :element)
		
	{
			
		System.out.println(link.getText()+"\t"+link.getAttribute("href"));
	}
	
	
	
	}	
	
	

}
//for(int i=0; i<=element.size(); i++)
//Thread.sleep(3000);	
		//driver.findElements(By.xpath("//div[@class='menu']/a"));