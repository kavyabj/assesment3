package com.kavya;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerdefination {
	RegisterActions rs = new  RegisterActions();
	Utility utility = new Utility();
	RegisterLocator reg = new RegisterLocator();

	@Given("user is in the democart page")
	public void user_is_in_the_democart_page() {
	    System.out.println("register here");
	}

	@Then("user clicck on register")
	public void user_clicck_on_register() {
	   rs.clickregister();
	   driver.find .getElement By(xpath="//*[@id=\"register-button\']");
	}

	@Then("users selects a gender")
	public void users_selects_a_gender() {
	    rs.gender();
	    System.out.println("female");
	}
	

	@When("users enter valid credentials")
	public void users_enter_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signupForm =dataTable.asMaps(String.class,String.class);
		for (Map<String, String>form: signupForm) {
	String firstname =form.get("firstname");
	rs.firstName(firstname); 
	System.out.println(" first name enterd");
	
	String lastname =form.get("lastname");
	rs.lastName(lastname); 
	System.out.println(" last name enterd");
	 

	String email =form.get("email");
	rs.email(email); 
	System.out.println(" email");
	

	String password =form.get("password");
	rs.setPassword(password); 
	System.out.println(" password");
	
	String compassword =form.get("comppassword");
	rs.setconfirmpassword(compassword); 
	System.out.println(" comppassword");
	}
	}
	@Then("user click on continue")
	public void user_click_on_continue() {
		System.out.println("continue");
	}

	
}
