import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorPramod {

	public static void main(String[] args) {
		//Multiple Windows
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("#content > div > a")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs);
		
		//since, you are using set, so you have to use iterator
		Iterator<String> i = tabs.iterator();
		while(i.hasNext()) {
			String childwindow = i.next();
			if(!childwindow.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("The child window is: " +childwindow);
				
			}
		}
		
		driver.quit();
		
		//frames and iframe
		
		
		
	}
	

}
