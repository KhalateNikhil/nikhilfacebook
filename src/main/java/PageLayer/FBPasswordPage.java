package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class FBPasswordPage extends BaseClass {

	@FindBy(name = "reg_passwd__")
	private WebElement pass;

	@FindBy(name = "birthday_day")
	private WebElement bday;

	public FBPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterPassword(String password) {
		pass.sendKeys(password);
	}

	public void enterDOB(String birthdate) {
		bday.sendKeys(birthdate);
	}

}
