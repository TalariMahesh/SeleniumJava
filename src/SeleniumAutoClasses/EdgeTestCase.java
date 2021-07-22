package SeleniumAutoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class EdgeTestCase {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\Java\\driv\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.fb.com/");
		
		String source = driver.getPageSource();
		System.out.println(source);
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
	}

}
