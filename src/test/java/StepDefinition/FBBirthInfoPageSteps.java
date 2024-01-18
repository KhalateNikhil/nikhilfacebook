package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.FBBirthInfoPage;
import io.cucumber.java.en.When;

public class FBBirthInfoPageSteps extends BaseClass {
	private static FBBirthInfoPage fbpage;

	@When("user enter birth month")
	public void user_enter_birth_month() {

		fbpage = new FBBirthInfoPage();
		fbpage.enterBirthMonth("Apr");
	}

	@When("user enter birth year")
	public void user_enter_birth_year() {
		fbpage.enterBirthYear("1999");

	}

}
