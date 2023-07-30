package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class ListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		throw new SkipException("This Test is skipped");
	}
	@Test(enabled = true)
	public void test4() throws InterruptedException {
		System.out.println("I am inside Test4");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation testing");
		WebElement enterkeypress = driver.findElement(By.name("q"));
		enterkeypress.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("testing is completed");
	}
	

}
