package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;

public class LoginPage extends Seleniumutils {
	WebDriver mydriver;

	public LoginPage(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Enter your Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement pwd;

	@FindBy(xpath="//a[contains(text(),'Reset password')]")
	WebElement resetPwd;
	
	@FindBy(xpath="//a[contains(text(),'Create account')]")
	WebElement createAc;
	public void clickCreateAc() {
		seleniumclick(createAc);
	}
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement signinbtn;
	
	
	@FindBy(xpath="//button[contains(text(),'Send Code')]")
	WebElement sendcodeBtn;
	
	@FindBy(xpath="//div[contains(text(),' Username/client id combination not found.')]")
	WebElement userNotFoundError;
	
	
	@FindBy(xpath="//input[@placeholder='Code']")
	WebElement code;
	
	@FindBy(xpath="//input[@placeholder='New Password']")
	WebElement newpwd;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitbtn;
	
	
	
	
	
	
	public RidePage login(String userName, String password) {
		Home home=new Home(driver);
		home.navigateToRegistrationPage();
		entertext(username,userName);
		entertext(pwd,password);
		seleniumclick(signinbtn);
		return new RidePage(driver);
		
	}

	

}
