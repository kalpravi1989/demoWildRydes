package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;

public class UserRegistration extends Seleniumutils {
	WebDriver mydriver;

	public UserRegistration(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	WebElement phoneno;
	
	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	WebElement createbtn;
	
	
	public void registerUser(String userName,String pwds,String email,String phonenum) {
		Home home=new Home(driver);
		home.navigateToRegistrationPage();
		LoginPage register=new LoginPage(driver);
		register.clickCreateAc();
		entertext(username,userName);
		entertext(pwd,pwds);
		entertext(emailid,email);
		entertext(phoneno,phonenum);
		seleniumclick(createbtn);
		
	}

}
