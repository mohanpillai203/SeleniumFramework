package multiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {
	
	WebDriver driver =null;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		System.out.println("Browser name is: " +browsername);
		System.out.println("ThreadID is: " +Thread.currentThread().getId());
		System.out.println("ThreadID is: " +Thread.currentThread().getName());
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void teardown() {
		
		System.out.println("Test Completed Sucessfully");
	}

}
