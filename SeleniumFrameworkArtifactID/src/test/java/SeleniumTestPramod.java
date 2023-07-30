
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestPramod {

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		explicitWait();
		//implicitWait();
		//FluentWait();

	}

	public static void explicitWait() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		// In explicit wait, it will not wait for entire max rime of 60 sec & poll/call condition of 5 secentered by the user, as and when we get output, it prints the appropriate output and it will complete the test asap
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60, 5));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")));
		//OR
		/*WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")));
				*/
		System.out.println(element.getText());
		driver.close();

	}

	@SuppressWarnings("deprecation")
	public static void implicitWait() {

		// default frequency/polling time for implicit wait : 250ms
		//In implicit wait, it will wait for 10sec completely which is static imput data entered by user.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getPageSource());

	}
	
	/*


		// waitng for 30sec for an element to be present on the page, checking it's presence for every 5sec frequent interval
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   
		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
	*/
		
		
	}
