package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.esiinsurance.generic.Test_Data_Creation;

public class EnterPaymentDetailsPage {

	@FindBy(name="recipt_no")
	private WebElement recipt_no;
	@FindBy(name="client_id")
	private WebElement client_id;
	@FindBy(name="month")
	private WebElement month;
	@FindBy(name="amount")
	private WebElement amount;
	@FindBy(name="due")
	private WebElement due;
	@FindBy(name="fine")
	private WebElement fine;
	@FindBy(name="agent_id")
	WebElement agent_id;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;



	public EnterPaymentDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRecipt_no() {
		return recipt_no;
	}

	public WebElement getClient_id() {
		return client_id;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getAmount() {
		return amount;
	}

	public WebElement getDue() {
		return due;
	}

	public WebElement getFine() {
		return fine;
	}

	public WebElement getAgent_id() {
		return agent_id;
	}
	public WebElement getSubmit() {
		return submit;
	}

	public void paymentDetails()
	{
		Test_Data_Creation data = new Test_Data_Creation();
		String value="1671537626";
		String months="august";

		client_id.sendKeys(value);
		month.sendKeys(months);
		amount.sendKeys(""+data.generateRandomNumber(500000));
		due.sendKeys(""+data.generateRandomNumber(1000));
		fine.sendKeys(""+data.generateRandomNumber(5000));
		submit.click();
	}
}
