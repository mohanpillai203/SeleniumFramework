import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().driverVersion("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("Automation testing");
		//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation testing");
		
		//WebElement textBox = driver.findElement(By.id("APjFqb"));
		//textBox.sendKeys("Automation testing");
		
		//List<WebElement> listOfInputElemets = driver.findElements(By.xpath("//input"));
		//int count = listOfInputElemets.size();
		
		
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("//textarea"));
		//int counts = listOfInputElements.size();
		
		//System.out.println("Count of 1st input elements" +count);
		//System.out.println("Count of 2nd input elements" +counts);
		
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
