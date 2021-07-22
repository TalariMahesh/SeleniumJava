package SeleniumAutoClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
public static void main(String args[])   {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/");
		List <String> list = new ArrayList<String>();
		List <String> list1 = new ArrayList<String>();
		for (int i=0;i<=4;i++) {
			List<WebElement>  th = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th["+i+"]"));
			for(WebElement th1 : th) {
				 System.out.println(th1.getText());
								  
			}
	    for (int j=0;j<=10;j++) {
	        List<WebElement> td = driver.findElements(By.xpath("//table[@id='example']/tbody/tr["+j+"]/td["+i+"]"));
	        for(WebElement td1 : td) {
			    System.out.println(td1.getText());
				 
			}
		}}
	  		
	    }
	   
}

