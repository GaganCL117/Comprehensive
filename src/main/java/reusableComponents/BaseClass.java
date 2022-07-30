package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;

import utility.ExtentRep;
import utility.Log4j;

public class BaseClass {

	Log4j logg = new Log4j();
	HelperClass help;
	ExtentRep rep = new ExtentRep();
	protected ExtentReports extent;
	protected Properties prop;
	protected FileInputStream fis;
	public Logger log;
	public static WebDriver driver;
	
	public WebDriver connections() throws IOException {
		log = logg.logger();
		extent = rep.extentReport();
		prop = new Properties();
		fis = new FileInputStream("./src/main/resources/source.properties");
		prop.load(fis);
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		driver = new ChromeDriver(op);
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		driver = new EdgeDriver();
//		log.info("Chrome Browser Started");
		log.info("Edge Browser Started");
		help = new HelperClass();
		help.maxWindow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
}
