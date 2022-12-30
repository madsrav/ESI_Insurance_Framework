package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.esiinsurance.generic.Test_Data_Creation;

public class EnterClientDetailsPage {

	@FindBy(name="client_id")
	private WebElement Clientid;
	@FindBy(name="client_password")
	private WebElement clientpwd;
	@FindBy(name="name")
	private WebElement clientname;
	@FindBy(xpath="//input[@class='img']")
	private WebElement image;
	@FindBy(name="sex")
	private WebElement gender;
	@FindBy(name="birth_date")
	private WebElement dateofbirth;
	@FindBy(name="maritial_status")
	private WebElement maritialStatus;
	@FindBy(name="nid")
	private WebElement nationalId;
	@FindBy(name="phone")
	private WebElement phoneNumber;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="policy_id")
	private WebElement policyId;
	@FindBy(name="agent_id")
	private WebElement agentId;
	@FindBy(name="nominee_id")
	private WebElement nomId;
	@FindBy(name="nominee_name")
	private WebElement nomName;
	@FindBy(name="nominee_sex")
	private WebElement nomGender;
	@FindBy(name="nominee_birth_date")
	private WebElement nomDateOfBirth;
	@FindBy(name="nominee_nid")
	private WebElement nomNationalId;
	@FindBy(name="nominee_relationship")
	private WebElement nomRelationship;
	@FindBy(name="priority")
	private WebElement priority;
	@FindBy(name="nominee_phone")
	private WebElement nomPhone;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public EnterClientDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getClientid() {
		return Clientid;
	}

	public WebElement getClientpwd() {
		return clientpwd;
	}

	public WebElement getClientname() {
		return clientname;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDateofbirth() {
		return dateofbirth;
	}

	public WebElement getMaritialStatus() {
		return maritialStatus;
	}

	public WebElement getNationalId() {
		return nationalId;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPolicyId() {
		return policyId;
	}

	public WebElement getAgentId() {
		return agentId;
	}

	public WebElement getNomId() {
		return nomId;
	}

	public WebElement getNomName() {
		return nomName;
	}

	public WebElement getNomGender() {
		return nomGender;
	}

	public WebElement getNomDateOfBirth() {
		return nomDateOfBirth;
	}

	public WebElement getNomNationalId() {
		return nomNationalId;
	}

	public WebElement getNomRelationship() {
		return nomRelationship;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getNomPhone() {
		return nomPhone;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void CreateClient()
	{
		Test_Data_Creation data =new Test_Data_Creation();
		String name= "swathi";
		String nominee="rajesh";

		clientpwd.sendKeys("123456");
		clientname.sendKeys(name+data.generateRandomNumber(99));
		image.sendKeys("C:\\Users\\Sravan Kumar\\OneDrive\\Pictures\\Screenshots\\Screenshot (30).png");	
		gender.sendKeys("female");
		dateofbirth.sendKeys(data.generatebirthdate());	
		maritialStatus.sendKeys("unmarried");	
		nationalId.sendKeys(""+data.generateUid());	
		phoneNumber.sendKeys(data.generatePhoneNumber());	
		address.sendKeys(data.fakeAddress());	
		policyId.sendKeys(data.policyid());	
		nomName.sendKeys(nominee+data.generateRandomNumber(99));	
		nomGender.sendKeys("male");	
		nomDateOfBirth.sendKeys(data.generatebirthdate());	
		nomRelationship.sendKeys(data.nomineeRelation());	
		priority.sendKeys(data.nomineePriority());		
		phoneNumber.sendKeys(data.generatePhoneNumber());	
		submit.click();
	}
}
