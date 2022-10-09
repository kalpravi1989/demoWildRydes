package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;

public class RidePage extends Seleniumutils {
	WebDriver mydriver;

	public RidePage(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}


}
