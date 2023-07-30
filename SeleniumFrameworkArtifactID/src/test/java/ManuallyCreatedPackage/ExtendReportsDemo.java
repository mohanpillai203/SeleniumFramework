package ManuallyCreatedPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsDemo {
	
	private static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReports.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 =  extent.createTest("Google search page testing", "Description: this is to test the search functionlity");
		 
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
	
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		test1.pass("Successful landing to google.com");
		test1.addScreenCaptureFromPath("extent.jpg").pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.jpg").build());
		
		driver.findElement(By.name("q")).sendKeys("W X Y Z");
		test1.pass("Entered text in search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("pressed keyboard enter key");
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		test1.info("Test is completed");
		
		//calling flush writes everything the log file
		extent.flush();
		
		System.out.println("Test completed");
		
	}

}
