package screens;

import org.openqa.selenium.WebElement;

import base.TestBase;

public class SearchCriteriaArea extends TestBase{
	
	WebElement  basfStudyId = ShowCaseSession.findElementByName("Two");
	WebElement  testGroup = ShowCaseSession.findElementByName("Two");
	
	public String getBasfStudyId() {
		return basfStudyId.toString().trim();
	}
	public String getTestGroup() {
		return testGroup.toString().trim();
	}
	
	
}
