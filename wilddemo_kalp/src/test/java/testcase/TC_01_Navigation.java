package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseClass;
import pages.Home;
import utils.Seleniumutils;
public class TC_01_Navigation extends BaseClass{
	
	@Test
	public void Navigation() {
		test = extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
		try {
		Home homepage=new Home(driver);
		homepage.navigation();
		//test.log(Status.PASS, "Navigation Function successful");
		}
		catch(Exception e){
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

}
