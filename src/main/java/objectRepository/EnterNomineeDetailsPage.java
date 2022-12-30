package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.insurance.esiinsurance.generic.Read_Data_From_Excel;
import com.insurance.esiinsurance.generic.Test_Data_Creation;

public class EnterNomineeDetailsPage {

	@FindBy(name="nominee_id")
	private WebElement nomId;
	@FindBy(name="client_id")
	private WebElement Clientid;
	@FindBy(name="name")
	private WebElement nomName;
	@FindBy(name="sex")
	private WebElement nomGender;
	@FindBy(name="birth_date")
	private WebElement nomDateOfBirth;
	@FindBy(name="nid")
	private WebElement nomNationalId;
	@FindBy(name="relationship")
	private WebElement nomRelationship;
	@FindBy(name="priority")
	private WebElement nompriority;
	@FindBy(name="phone")
	private WebElement nomPhone;
	@FindBy(xpath="//input[@value='UPDATE']")
	private WebElement submit;

	//to initialize the webdriver elements
	public EnterNomineeDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	//to access the web elements in our test scripts we use getter methods
	public WebElement getNomId() {
		return nomId;
	}
	public WebElement getNomName() {
		return nomName;
	}
	public WebElement getClientid() {
		return Clientid;
	}

	public WebElement getNompriority() {
		return nompriority;
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
		return nompriority;
	}
	public WebElement getNomPhone() {
		return nomPhone;
	}
	public WebElement getSubmit() {
		return submit;
	}

	public void createNominee() throws Exception
	{
		Test_Data_Creation data =new Test_Data_Creation();
		String nominee="rajesh";
		
		//importing data from excel
		Read_Data_From_Excel data_From_Excel= new Read_Data_From_Excel();
		String clientid =data_From_Excel.readDataFromExcel("Sheet1",4, 0);
		String gender= data_From_Excel.readDataFromExcel("Sheet1",5, 0);
		String relationship = data_From_Excel.readDataFromExcel("Sheet1",6, 0);
		String priority= data_From_Excel.readDataFromExcel("Sheet1",7, 0);
	    
		Clientid.sendKeys(clientid);
		nomName.sendKeys(nominee+data.generateRandomNumber(99));
		nomGender.sendKeys(gender);
		nomDateOfBirth.sendKeys(data.generatebirthdate());
		nomNationalId.sendKeys(""+data.generateUid());
		nomRelationship.sendKeys(relationship);
		nompriority.sendKeys(priority);
	    nomPhone.sendKeys(data.generatePhoneNumber());
	}
}
