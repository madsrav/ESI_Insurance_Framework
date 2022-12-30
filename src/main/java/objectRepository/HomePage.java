package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	@FindBy(xpath="//a[text()='CLIENTS']")
	private WebElement clientmodule;
	
	@FindBy(xpath="//a[.='NOMINEE']")
	private WebElement nomineemodule;
	
	@FindBy(xpath="//a[.='PAYMENTS']")
	private WebElement paymentsmodule;
	
	public WebElement getPaymentsmodule() {
		return paymentsmodule;
	}

	@FindBy(xpath="//div[@class='header-right']")
	WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getClientmodule() {
		return clientmodule;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getNomineemodule() {
		return nomineemodule;
	}
	
}


