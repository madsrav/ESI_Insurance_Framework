package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickAddNomineeButtonPage {
	
	@FindBy(xpath="//a[.='Add Nominee']")
	private WebElement AddNominee;

	public ClickAddNomineeButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNominee() {
		return AddNominee;
	}
}
