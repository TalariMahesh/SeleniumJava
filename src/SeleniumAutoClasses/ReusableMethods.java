package SeleniumAutoClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {
	 

	public static void dropdown(By locator, String type, String value ){

		    Select select = new Select(getElement(locator));

		    switch (type){
		    case "index": 
		    	select.selectByIndex(Integer.parseInt(value));
		        break;
		    case "value":		  
		        select.selectByValue(value);
		        break;
		    case "visibletext":		     
		    	select.selectByVisibleText(value);
		        break;  
		    default:
		    	System.out.println("Please select the correct case");
		    	break;
		    }
			           
		       
	 }

	private static WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}
}
	 
	