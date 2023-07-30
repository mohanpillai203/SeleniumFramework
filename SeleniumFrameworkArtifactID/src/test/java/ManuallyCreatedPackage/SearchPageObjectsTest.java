package ManuallyCreatedPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageOM.SearchPageObjects;

public class SearchPageObjectsTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		SearchGoogleTest();

	}
	
	public static void SearchGoogleTest() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		SearchPageObjects searchPageObj = new SearchPageObjects(driver);
		//Now, i can use this object created for SearchPageObjects webpage to call any of those functions which are dfeined in the class SearchPageObjects()
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		searchPageObj.clickSearchButton();
		
		Thread.sleep(4000);
		driver.close();
	}
	

}
