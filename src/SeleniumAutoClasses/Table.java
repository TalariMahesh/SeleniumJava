package SeleniumAutoClasses;

import java.util.ArrayList;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.openqa.selenium.WebElement;

public class Table {
public static void main(String args[])   {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java\\driv\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		List <String> list = new ArrayList<String>();
		for(WebElement th : table) {
			  System.out.println(th.getText());
		   list.add(th.getText());
		   }
		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		List <String> list1 = new ArrayList<String>();
		for(WebElement td1 : table1) {
			  //System.out.println(td1.getText());
		   list1.add(td1.getText());
		   }
			Multimap<String,String> map= ArrayListMultimap.create();
				 for(int i=0; i<=list1.size()-1;i++) {
					map.get(list.get(0)).add(list1.get(i));
		 }
		 System.out.println(map);

}
}