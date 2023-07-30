import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		
		Thread.sleep(15000);
		action.dragAndDrop(drag, drop).build().perform();
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText();
		System.out.println(actualText);
		
		/*
		 * WebDriver driver = new FirefoxDriver();
		 * driver.get("https://staging.keela.co/login"); WebDriverWait wait = new
		 * WebDriverWait (driver, 15); 
		 * WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-email']")));
		 * element.sendKeys("bandanakeela@yopmail.com");
		 * driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("keela"); 
		 * driver.findElement(By.xpath("//button[@class='btn btn-sm btn-block btn-primary']")).click();
		 */

	}

}
