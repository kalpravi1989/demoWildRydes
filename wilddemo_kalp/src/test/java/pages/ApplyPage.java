package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;

public class ApplyPage extends Seleniumutils {
	WebDriver mydriver;

	public ApplyPage(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='btn-menu']/child::span")
	public WebElement mainMenu;

	
	
}
