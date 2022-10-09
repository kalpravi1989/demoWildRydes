package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;
public class Home extends Seleniumutils {
	WebDriver mydriver;

	public Home(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='btn-menu']/child::span")
	public WebElement mainMenu;

	
	@FindBy(xpath="//nav[@id='nav']//a[contains(text(),'Meet the Unicorns')]")
	public WebElement meetUnicorn;
	
	public void navigateToMeetUnicornPage() {
		seleniumclick(mainMenu);
		seleniumclick(meetUnicorn);
		checkNavigation("unicorns");
		
	}
	
	@FindBy(xpath="//nav[@id='nav']//a[contains(text(),'Investors & Board of Directors')]")
	WebElement investorsbtn;
	public void navigateToInvestorsPage() {
		seleniumclick(mainMenu);
		seleniumclick(investorsbtn);
		checkNavigation("investors");
		
		
	}
	@FindBy(xpath="//nav[@id='nav']//a[contains(text(),'FAQ')]")
	public WebElement faq;
	
	public void navigateToFaqPage() {
		seleniumclick(mainMenu);
		seleniumclick(faq);
		checkNavigation("faq");
		
	}
	@FindBy(xpath="//nav[@id='nav']//a[contains(text(),'Apply')]")
	public WebElement applybtn;
	public void navigateToApplyPage() {
		seleniumclick(mainMenu);
		seleniumclick(applybtn);
		checkNavigation("apply");
		
	}
	
	
	@FindBy(xpath="//nav[@id='nav']//a[contains(text(),'Register')]")
	public WebElement registerbtn;
	
	public void navigateToRegistrationPage() {
		seleniumclick(mainMenu);
		seleniumclick(registerbtn);
		checkNavigation("auth");
		
	}
	

	public void navigation() {
		
		navigateToMeetUnicornPage();
		navigateToInvestorsPage();
		navigateToFaqPage();
		navigateToApplyPage();
		navigateToRegistrationPage();
		
		
	}
	
	
	
		
		
		
	}
	

