package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class FBLoginPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement phn;

	public FBLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void userNameLastnameAndPhn(String firstname, String lastname, String phone) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		phn.sendKeys(phone);
	}
}
