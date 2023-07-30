package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configPackage.PropertiesFile;

public class ExcelDataProvider {
	WebDriver driver =null;
	/*
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "/excel/data.xlsx";
		testData(excelPath, "Sheet1");	
		
	}
	*/	
    @BeforeTest
	public void setUpTest() {
	
			driver = new ChromeDriver();
	}
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password) throws InterruptedException {
		System.out.println(username+"  |  "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	//how to use testNG data	
	@DataProvider(name ="test1data")
	public /*static-->this was used for main method*/ Object getData() {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath + "/excel/data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");	
		return data;
	}
	//how ot use Excel data
	public /*static-->this was used for main method*/ Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				//System.out.println(cellData+ " |  ");

				data[i-1][j] = cellData;
			}
			System.out.println();
			
		}
		return data;
	}

}
