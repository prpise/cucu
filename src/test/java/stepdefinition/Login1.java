package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login1 {
	@Given("user open signup page")
	public void user_open_signup_page() {
		System.out.println("user open signup page");
	}
	    

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
		System.out.println("firstname is" +fn);
		
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		System.out.println("firstname is" +ln);
		
		
	}
	

	@When("user enters dod as {string}")
	public void user_enters_dod_as(String dob) {
		System.out.println("dob is" +dob);
	
	}
	  

	@When("user enters pwd as {string}")
	public void user_enters_pwd_as(String pwd) {
		System.out.println("password is" +pwd);
	   
	}

	@When("user enters confirm pwd as {string}")
	public void user_enters_confirmpwd_as(String confirmpwd) {
		System.out.println("confirm password is" +confirmpwd);
	    
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("user click submit");
	
	
	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
		System.out.println("login success");
	   
	}


}
