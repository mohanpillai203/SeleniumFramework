import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsIFrames {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60, 5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*
		 * //alert box
		 * driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		 * Alert alert = wait.until(ExpectedConditions.alertIsPresent()); String text =
		 * String text = alert.getText(); 
		 * System.out.println(text); 
		 * alert.accept();
		 */
		
		/*
		 * //confirm box
		 * driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		 * wait.until(ExpectedConditions.alertIsPresent()); 
		 * Alert alert2 = driver.switchTo().alert(); 
		 * String text2 = alert2.getText();
		 * System.out.println(text2); 
		 * alert2.accept();
		 */
		
		//PromptBox
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Sanal");
		alert3.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.close();
		
}
}