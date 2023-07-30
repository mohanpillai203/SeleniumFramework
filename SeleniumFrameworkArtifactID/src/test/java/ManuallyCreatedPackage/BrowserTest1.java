package ManuallyCreatedPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//This is not a good frameowork Design
public class BrowserTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		googlesearch();
		
	}
	
	public static void googlesearch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//got to goole.com
		driver.get("https://www.google.com/");
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation testing");
		//click on search option
		//driver.findElement(By.name("btnK")).click();
		//how to press enter key without click
		WebElement enterkeypress = driver.findElement(By.name("q"));
		enterkeypress.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("testing is completed");
	}

}
