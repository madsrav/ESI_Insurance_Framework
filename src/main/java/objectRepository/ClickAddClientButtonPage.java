package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickAddClientButtonPage {
	
	@FindBy(xpath="//a[.='Add Client']")
	private WebElement addbutton;
	
	
	public ClickAddClientButtonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbutton() 
	{
		return addbutton;
	}	
}
