package configPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import ManuallyCreatedPackage.TestNG_Demo;

public class PropertiesFile {
	// create an object of class properties
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {
		try {
			// create an object of class inputstream
			InputStream input = new FileInputStream(projectPath + "/src/test/java/configPackage/config.properties");
			// load the properties file
			prop.load(input);
			// Get values from the properties file
			String Broswer = prop.getProperty("browser");
			System.out.println(Broswer);
			TestNG_Demo.browserName = Broswer;
			
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
			e.printStackTrace(System.out);
		}

	}

	public static void setProperties() {

		try {
			// create an object of class outputstream
			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/configPackage/config.properties");
			//set the values
			prop.setProperty("browser", "chrome");
			/*
			 *calling this method setProperties() from TestNG_Demo class under @After test TestNG criteria of tear down method. this will be reflected in config.properties file
			 * prop.setProperty("result", "PASS");
			 */
			//store the values in the properties file
			prop.store(output,"Storing the updated values");
			
		} catch (FileNotFoundException e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
			e.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
