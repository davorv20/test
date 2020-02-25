package util;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.TestBase;

public class TestUtil extends TestBase{

	public void click(WebElement element, String elementName)  {			
		element.click();
		childTest.info(elementName + " is clicked");
		System.out.println(elementName + " is clicked");	
	}
	
	public void assertEquals(String element, String expectedResult)  {			
		 Assert.assertEquals(element, expectedResult);
		 childTest.info("Element is " + expectedResult + " presented");
		 System.out.println("Element is " + expectedResult + " presented");
	}
	
	public void wpfTrialCancel()  {			
		ShowCaseSession.findElementByName("Cancel").click();
	}
	
	
	
}
