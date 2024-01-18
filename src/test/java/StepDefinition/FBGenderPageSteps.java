package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.FBGenderPage;
import io.cucumber.java.en.When;

public class FBGenderPageSteps extends BaseClass {
	private static FBGenderPage genderpage;

	@When("user select proper gender")
	public void user_select_proper_gender() {

		genderpage = new FBGenderPage();
		genderpage.selectGender("Male");

	}

}
