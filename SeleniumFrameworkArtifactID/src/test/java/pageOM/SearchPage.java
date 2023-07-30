package pageOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	//to make it avialable only to this class, use private | and static because the element can be refernced in static way to  all the mehtods availble in that class
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		//WebElement element = driver.findElement(By.name("q"));
		//google text box
		element = driver.findElement(By.name("q"));
		return element;
		
	} 
	
	public static WebElement button_search(WebDriver driver) {
		//google search button
		//element = driver.findElement(By.name("btnK"));
		element = driver.findElement(By.name("q"));
		return element;
	}

}
