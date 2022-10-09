package testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseClass;
import base.JsonReader;
import pages.UserRegistration;


public class TC_03_CreateUser extends BaseClass{

	@Test
	public void usercreation() {
	test = extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName());

	try {
		UserRegistration reg=new UserRegistration(driver);
		JsonReader reader = new JsonReader();
		reader.getdata();
		reg.registerUser(reader.getUsername(), reader.getPassword(), reader.getEmail(), reader.getPhoneno());
	
	}
	catch(Exception e){
		test.log(Status.FAIL, e.getMessage());
		
	}
}
}
