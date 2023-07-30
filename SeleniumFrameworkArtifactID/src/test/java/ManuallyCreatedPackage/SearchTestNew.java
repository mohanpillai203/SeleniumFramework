package ManuallyCreatedPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageOM.SearchPage;
//This is not a good frameowork Design
public class SearchTestNew {
	
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		googlesearch();
		
	}
	
	public static void googlesearch() throws InterruptedException {
		driver = new ChromeDriver();
		//got to goole.com
		driver.get("https://www.google.com/");
		//enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Automation testing");
		
		SearchPage.textbox_search(driver).sendKeys("Automation testing");
		
		//click on search option
		//driver.findElement(By.name("btnK")).click();
		//how to press enter key without click
		//WebElement enterkeypress = driver.findElement(By.name("q"));
		//enterkeypress.sendKeys(Keys.RETURN);
		
		//SearchPage.button_search(driver).click();
		SearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("testing is completed");
	}

}
