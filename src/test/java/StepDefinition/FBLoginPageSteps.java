package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.FBLoginPage;
import io.cucumber.java.en.Given;

public class FBLoginPageSteps extends BaseClass {
	private static FBLoginPage fb;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		BaseClass.initialization();
		String url1 = prop.getProperty("url");
		driver.get(url1);

	}

	@Given("user enter {string},{string} and {string}")
	public void user_enter_and(String Firstname, String Lastname, String PhoneNumber) {

		FBLoginPage fb = new FBLoginPage();

		fb.userNameLastnameAndPhn(Firstname, Lastname, PhoneNumber);
	}

}
