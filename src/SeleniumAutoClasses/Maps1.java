package SeleniumAutoClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps1 {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
	   		WebElement from = driver.findElement(By.xpath("//*[@id='fromPlaceName']"));
		from.sendKeys("HYDE");
		from.sendKeys(Keys.ARROW_DOWN);
	from.sendKeys(Keys.ENTER);
	WebElement to = driver.findElement(By.xpath("//*[@id='toPlaceName']"));
	to.sendKeys("vijaya");
	to.sendKeys(Keys.ARROW_DOWN);
    to.sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
   Thread.sleep(1000);
   List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
   //System.out.println(dates.size());
	   for(WebElement ele : dates) {
	   //System.out.println(ele.getText());
		  if(ele.getText().equals("25")) {
	  	  ele.click();
	  	  break;
			   }
		   }
driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
 List<WebElement> servnos = driver.findElements(By.xpath("//*[@id='ForwardResults']/div/div/div[1]/div"));
//System.out.println(servnos.size());
List <String> list = new ArrayList<String>();
for(WebElement sr : servnos) {
		   //System.out.println(sr.getText());
	   list.add(sr.getText());
	   }
//System.out.println(list);
List<WebElement> seats = driver.findElements(By.xpath("//span[@class='availCs']"));
//System.out.println(seats.size());
List <String> list1 = new ArrayList<String>();
for(WebElement se : seats) {
		   //System.out.println(se.getText());
	   list1.add(se.getText());
	   }
//System.out.println(list1);
 Map<String,String> map= new HashMap<>();
 for(int i=0; i<=servnos.size()-1;i++) {
		 map.put(list.get(i),list1.get(i));
 }
 System.out.println(map);
 	}    
   }
