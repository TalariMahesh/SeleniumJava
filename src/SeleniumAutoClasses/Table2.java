package SeleniumAutoClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
public static void main(String args[])   {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/");
		
		List <String>  list = new ArrayList<String>();
		List <String> list1 = new ArrayList<String>();
		List<WebElement> th1 = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		for(WebElement th : th1) {			
			 list.add(th.getText());
			 //System.out.println(th.getText());
		}
		 Map<String,Integer> map= new HashMap<>();
		 for (int i=0;i<=list.size()-1;i++) {
			 map.put(list.get(i), i+1);
		 }
	
		 System.out.println(map);
		 List<WebElement> td = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td["+map.get("Position")+"]"));
		 for(WebElement td1 : td) {			
			 list1.add(td1.getText());
			 		}
		 for (int j=0;j<=list1.size()-1;j++) {
				System.out.println(list1.get(j));
		 }
		 
}}
		
	

	    	
	    
		


