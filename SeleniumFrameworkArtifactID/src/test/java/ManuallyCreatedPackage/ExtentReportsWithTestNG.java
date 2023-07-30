package ManuallyCreatedPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsWithTestNG {

	private static WebDriver driver = null;
	ExtentReports extent;
	ExtentSparkReporter spark;

	@BeforeSuite
	public void setUp() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("extentReports.html");
		extent.attachReporter(spark);

	}
	
    @BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		ExtentTest test =  extent.createTest("Google search page testing", "Description: this is to test the search functionlity");
		
		test.addScreenCaptureFromPath("extent.html");
		test.info("info");
		test.pass("Successful landing to google.com");
		test.warning("warn");
		test.skip("skip");
		test.fail("fail");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.html").build());	
		

	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		System.out.println("testing is completed");
	}
	
	@AfterSuite
	public void tearDown() {
		//calling flush writes everything the log file
		extent.flush();
	}

}
