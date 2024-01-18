package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class FBGenderPage extends BaseClass {

	@FindBys(@FindBy(xpath = "//span[@class='_5k_2 _5dba']"))
	private List<WebElement> gen;

	public FBGenderPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectGender(String gender) {

		for (WebElement abc : gen) {
			if (abc.getText().equalsIgnoreCase(gender)) {
				abc.click();
				break;
			}
		}

	}

}
