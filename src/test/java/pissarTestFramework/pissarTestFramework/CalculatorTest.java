package pissarTestFramework.pissarTestFramework;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
import screens.Calculator;
import util.TestUtil;

@Listeners(util.TestListener.class)
public class CalculatorTest extends TestBase
{
	
    Calculator screen;
    TestUtil helper; 

    public CalculatorTest() {
		super ();
	}

	@BeforeTest
    public void Clear()
    {
		System.out.println("Before Test");
		screen = new Calculator();
		helper = new TestUtil();
    }
	
	@Test(enabled = true, description="This is calculator test case")
	public void CalculatorTest() throws InterruptedException
	{
		  helper.click(screen.getOne(), "Number One");
		  helper.click(screen.getPlus(), "Plus");
		  helper.click(screen.getTwo(), "Number Two");
		  helper.click(screen.getEquals(), "Equals");
		  helper.assertEquals(screen.getCalculatorResults(), "4");
	}
	
	@Test(enabled = true, description="This is calculator1 test case")
	public void CalculatorTest1() throws InterruptedException
	{
		  helper.click(screen.getOne(), "Number One");
		  helper.click(screen.getPlus(), "Plus");
		  helper.click(screen.getTwo(), "Number Two");
		  helper.click(screen.getEquals(), "Equals");
		  helper.assertEquals(screen.getCalculatorResults(), "3");
	}
	
	

}
