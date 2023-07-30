package pageOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPageObjects {
	
	//just to save some memory, we are putting null else we can keep only Webdriver driver; 
	
	WebDriver driver = null;
	
	By textbox_search = By.id("APjFqb");
	By button_search = By.name("q");
	
	//you can call "WebDriver driver1"  an argument so that it can understand that driver1 will be from the main class and not this currentwebpage class
	//create a constructor where you can use this statement to reference driver1(main class) with driver(current clss)
	public SearchPageObjects(WebDriver driver) {
		
		//driver = driver1;
		this.driver = driver;
	}
	
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
