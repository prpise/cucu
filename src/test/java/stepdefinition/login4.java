package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class login4 {

@Given("application displays welcome message")
public void application_displays_welcome_message() {
	System.out.println("Welcome");
	
}


@Given("users un and psd")
public void users_un_and_psd() {
	System.out.println("username and password is entered");
  
}

@Given("click signin")
public void click_signin() {
	
}

@When("user searches for iphone")
public void user_searches_for_iphone() {
	System.out.println("search for iphone");
   
}

@When("user adding the searched product to the cart")
public void user_adding_the_searched_product_to_the_cart() {
	System.out.println("added to cart");
 
}

@When("user performing payment process using net banking")
public void user_performing_payment_process_using_net_banking() {
	System.out.println("payment using net banking");
 
}

@When("user click on signout")
public void user_click_on_signout() {
	
    
}

}
