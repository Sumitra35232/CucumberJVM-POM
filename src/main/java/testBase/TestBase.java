package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilities.DriverUtil;
import utilities.TestUtil;
import utilities.WebEventListener;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			String path="C:/Users/Shrawan Rauniyar/assignment/CucumberDemo/src/main/java/config/config.properties";
			FileInputStream ip = new FileInputStream(path);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String chooseDriver()
	{
		String browserName = System.getProperty("browser");
		if(browserName!=null)
		{
			return browserName;
		}else
		{
		browserName = prop.getProperty("browser");
		return browserName;
		}
	}
	
	public static void initialization(){
		

	    String browserName=chooseDriver();
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",DriverUtil.chromeDriverPath);	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver",DriverUtil.geckoDriverPath );	
			driver = new FirefoxDriver(); 
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitelyWait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}
}


