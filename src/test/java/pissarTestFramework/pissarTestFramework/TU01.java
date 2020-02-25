package pissarTestFramework.pissarTestFramework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.SearchCriteriaArea;
import util.TestUtil;

public class TU01 extends TestBase{
	
	SearchCriteriaArea searchCriteriaArea; 
    TestUtil helper; 

	public TU01() {
		super();
	}
	
	@BeforeTest
    public void BeforeTest()
    {
		System.out.println("Before Test TU01");
		//searchCriteriaArea = new SearchCriteriaArea();
		helper = new TestUtil();
    }
	
	@Test(enabled = true, description="Verify displayed text  on Search Criteria Area using Test Data.")
	public void VerifyDisplayedText() throws InterruptedException
	{
		  helper.wpfTrialCancel();
		  Thread.sleep(5000);
		  
		  //helper.assertEquals(searchCriteriaArea.getBasfStudyId(), "4");
		  //helper.assertEquals(searchCriteriaArea.getTestGroup(), "4");
	}
	

}
