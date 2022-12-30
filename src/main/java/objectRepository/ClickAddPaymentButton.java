package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClickAddPaymentButton {
	
		@FindBy(xpath="//a[.='Add Payment']")
		private WebElement addpayment;

		public ClickAddPaymentButton(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getAddpayment() {
			return addpayment;
		}
		
	

}
