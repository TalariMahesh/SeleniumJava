package SeleniumAutoClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections1 {

	public static void main(String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
		List<WebElement> element	=	driver.findElements(By.xpath("//*[@id='home-bot']/div/div[1]/ul/li"));
	List <String> list = new ArrayList<String>();
	System.out.println(element.size());
	for (WebElement Text :element)
			{			
		//System.out.println(Text.getText());
		list.add(Text.getText());
	}
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.contains("Tirupati - Hyderabad"));
	System.out.println(list.contains("Tirupati - Bangalore"));
	System.out.println(list.indexOf("Tirupati - Hyderabad"));
	System.out.println(list.indexOf("Tirupati - Bangalore"));
	System.out.println(list.get(14));
	driver.quit();
		
}
}