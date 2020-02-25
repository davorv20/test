package util;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;


public class TestListener extends TestBase implements ITestListener{
		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("Test Listener On Finish");
	    }		
	
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("Test Listener On Start");
			parentTest = extent.createTest("Calculator Test");
	    }		
		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	    }		
		
	    public void onTestFailure(ITestResult arg0) {	
	    	System.out.println("Test Listener On Test Failure");
	        // TODO Auto-generated method stub		
	    	
	    	 //Take base64Screenshot screenshot.
	        String testFailureCapture = "data:image/png;base64," + ((TakesScreenshot) ShowCaseSession).
	            getScreenshotAs(OutputType.BASE64);
	   
	    	childTest.fail(arg0.getThrowable().getMessage());
	        childTest.addScreenCaptureFromBase64String(testFailureCapture, "Test Failure Screenshot");
	   
	    }		
	
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("Test Listener On Test Start " + arg0.getMethod().getDescription());
	    	childTest = parentTest.createNode(arg0.getMethod().getDescription());

	    }		

	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub		
	    	System.out.println("Test Listener On Test Success");
	    }		


}
