package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBys({@FindBy(name="username"),@FindBy(xpath="//input[@type='text']")})
	private WebElement uname;

	@FindAll({@FindBy(name="password"),@FindBy(xpath="//input[@type='password']")})
	private WebElement pwd;

	@FindBy(xpath="//button[.='login']")
	private	WebElement login;


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUname() {
		return uname;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public void Login(String username,String password)
	{
	uname.sendKeys(username);
	pwd.sendKeys(password);
	login.click();
	}


}
