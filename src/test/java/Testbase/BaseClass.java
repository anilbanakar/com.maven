package Testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	
public  static WebDriver driver;
public Logger logger; // log4j
	
	@BeforeClass(groups= {"Master","Sanity","Regression"})
	@Parameters ("browser") // this is for parallel execution
	public void setup(String br) throws IOException
	{
		logger= LogManager.getLogger(this.getClass()); // this is to generate logs 
		
		//loggin config.properties file
		FileInputStream fs = new FileInputStream(".//src//test//resources//Config.properties");
		Properties prop = new Properties();
		prop.load(fs);
		switch(br.toLowerCase())
             {
            	 case "chrome" : 	driver= new ChromeDriver(); break;
            	 //case "edge"    : driver = new EdgeDriver(); break; 
            	 //case "firefox" : driver = new FirefoxDriver(); break;
            	 default : System.out.println("invalid brodwer");
            	 return;	
              } 
			
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	/*
	 * @AfterClass public void tearDown() { driver.close(); }
	 */	 	

	public String captureScreen(String name) {
		String screenshot = null;
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			String base64EncodedScreenshot = ts.getScreenshotAs(OutputType.BASE64);
			screenshot = "data:image/png;base64," + base64EncodedScreenshot;
		} catch (WebDriverException e) {
			e.printStackTrace();
			//test.fail("Exepection : Unable to take screenshot "+e.getMessage());
		}
		
		return screenshot;
	}



}
	
	
	
	

