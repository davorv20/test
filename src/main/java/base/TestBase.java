package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class TestBase {
	
	public static WindowsDriver ShowCaseSession = null;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	public static String root;
	
	@BeforeSuite
	public void beforeTest() {
    	   root = System.getProperty("user.dir");
    	   reporter = new ExtentHtmlReporter( root + "/report.html");
   		   extent = new ExtentReports();
   		   extent.attachReporter(reporter);
   		   		  
   		   try {
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("app", System.getenv("PISAR_LOCATION"));
	            ShowCaseSession = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), capabilities);
	            ShowCaseSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        }catch(Exception e){
	            e.printStackTrace();
	        } 
	}
	
	@AfterSuite
	public void afterSuite() {
    	System.out.print("After suite \n");
		extent.flush();
		ShowCaseSession.close();
		ShowCaseSession.quit();
	}

	
	
	
	
	
	
}
