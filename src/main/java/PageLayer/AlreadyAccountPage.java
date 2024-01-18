package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AlreadyAccountPage extends BaseClass {

	@FindBy(xpath = "//a[text()='Already have an account?']")
	private WebElement accountlink;

	public AlreadyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAccountLink() {
		accountlink.click();
	}
}
