package testcase;

import org.testng.annotations.Test;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseClass;
import base.ExcelReader;
import pages.LoginPage;

public class TC_02_login extends BaseClass {
	
	@Test
	public void loginTest() {
	test = extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName());
	HashMap<String,String> getdata = ExcelReader.getData(this.getClass().getSimpleName());
	try {
	
	LoginPage reg=new LoginPage(driver);
	String userN=getdata.get("UserName");
	System.out.println(userN);
	
	reg.login(getdata.get("UserName"), getdata.get("Password"));
	test.log(Status.PASS, "Login Successfull");
	}
	catch(Exception e) {
		test.log(Status.FAIL, e.getMessage());
	}
	

	}
}
