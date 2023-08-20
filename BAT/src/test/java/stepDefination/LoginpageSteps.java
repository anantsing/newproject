package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Loginpage;


public class LoginpageSteps {
	WebDriver driver;
	Loginpage login = new Loginpage();
	
	

	@Given("user launch site URL")
	public void user_launch_site_url() {
	   login.user_launch_site_url();
	   
	}

	

	@When("enter correct username and password")
	public void enter_correct_username_and_password() {
	 // login.enter_correct_username_and_password();
	}
	       
	
	
	
	
	@And("click on login button")
	public void click_on_login_button() {
		login.click_on_login_button();
	}

	@Then("validate is succesful")
	public void validate_is_succesful() {
	   login.validate_is_succesful();
	}

	@When("enter correct {string} and {string}")
	public void enter_correct_and(String username, String password) {//regex = regular expression
	    login.enter_correct_username_and_password(username, password);
	}


}
