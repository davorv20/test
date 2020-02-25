package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class Calculator extends TestBase{
		
	public Calculator() {
		PageFactory.initElements(ShowCaseSession, this);
	}
	
	public WebElement getOne() {
		return   ShowCaseSession.findElementByName("One");
	}

	public WebElement getPlus() {
		return   ShowCaseSession.findElementByName("Plus");
	}

	public WebElement getTwo() {
		return   ShowCaseSession.findElementByName("Two");
	}

	public WebElement getEquals() {
		return   ShowCaseSession.findElementByName("Equals");
	}
	
	public String getCalculatorResults() {
		return  ShowCaseSession.findElementByAccessibilityId("CalculatorResults").getText().replace("Display is", "").trim();
	}
	
	
}
