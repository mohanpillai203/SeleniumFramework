package ManuallyCreatedPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configPackage.PropertiesFile;
import pageOM.SearchPage;

public class TestNG_Demo {
	
	private static WebDriver driver = null;
	public static String browserName =null;
	
    @BeforeTest
	public void setUpTest() {
    	
    	PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
	}
	
    @Test
	public static void googlesearch() {
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
		

	}
    
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		System.out.println("testing is completed");
		/*
		 * PropertiesFile.setProperties();
		 */
	}

}
