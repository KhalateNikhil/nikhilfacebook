package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class FBBirthInfoPage extends BaseClass {

	@FindBy(name = "birthday_month")
	private WebElement bmonth;

	@FindBy(name = "birthday_year")
	private WebElement byear;

	public FBBirthInfoPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterBirthMonth(String birthmonth) {
		Select sel = new Select(bmonth);
		sel.selectByVisibleText(birthmonth);
	}

	public void enterBirthYear(String birthYear) {

		Select sel1 = new Select(byear);
		sel1.selectByVisibleText(birthYear);
	}

}
