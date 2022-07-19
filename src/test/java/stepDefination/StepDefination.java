package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;





public class StepDefination {

	
	@Given("User is in NetBanking landing page")
	public void user_is_in_net_banking_landing_page() {
	    System.out.println("babuni");
		
	
	}
	@When("Login to application with username and password")
	public void login_to_application_with_username_and_password() {
		System.out.println("Lucky");
	 
	}
	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("subash");
	    
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("subash");
	    
	}




}