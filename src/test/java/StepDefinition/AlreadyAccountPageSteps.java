package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.AlreadyAccountPage;
import io.cucumber.java.en.When;

public class AlreadyAccountPageSteps extends BaseClass {
	private static AlreadyAccountPage already;

	@When("user click on already have an account link")
	public void user_click_on_already_have_an_account_link() {
		already = new AlreadyAccountPage();
		already.clickOnAccountLink();
	}

}
