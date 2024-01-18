package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.FBPasswordPage;
import io.cucumber.java.en.When;

public class FBPasswordPageSteps extends BaseClass {
	private static FBPasswordPage fbp;

	@When("user enter password")
	public void user_enter_password() {

		fbp = new FBPasswordPage();
		fbp.enterPassword("nsk123");

	}

	@When("date of birth")
	public void date_of_birth() {
		fbp.enterDOB("6");

	}

}
