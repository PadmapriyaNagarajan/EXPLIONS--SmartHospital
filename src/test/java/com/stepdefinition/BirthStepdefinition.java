package com.stepdefinition;


import com.actions.BirthAndDeathActions;
import com.locators.BirthAndDeathLocators;
import com.utility.HelperClass;
import com.utility.Utility;

import io.cucumber.java.en.*;

public class BirthStepdefinition extends Utility {
	BirthAndDeathActions objBDA=new BirthAndDeathActions();
	BirthAndDeathLocators objloc=new BirthAndDeathLocators();
	Utility util=new Utility();
////	@Given("user is navigate to login page")
////	public void user_is_navigate_to_login_page() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////	}
////
////	
////	@Given("user be in birth and death record")
////	public void user_be_in_birth_and_death_record() {
////		HelperClass.openPage("https://demo.smart-hospital.in/admin/birthordeath/death");
////	  
////	}
////
////	@When("user need to click the birth and death record")
////	public void user_need_to_click_the_birth_and_death_record() throws InterruptedException {
////		Thread.sleep(3000);
////		objBDA.BirthAnddeath();
////		
////
////
////	}
////
////	@When("user click the birth record")
////	public void user_click_the_birth_record() {
////	    objBDA.birthRecord();
////	}
////
////	@When("user click the Add birth record")
////	public void user_click_the_add_birth_record() {
////	   objBDA.AddbirthRecord();
////	}
////
////	@When("user enters the require values")
////	public void user_enters_the_require_values() {
////	   objBDA.AddBirthRecord(util.ChildName, util.Weight, util.Birth, util.CaseId, util.Phone, util.AddreSS, util.Fathername, util.Report);
////		
////	    
////	}
////
////	@Then("user need to click save")
////	public void user_need_to_click_save() {
////	    objBDA.AddRecord();
////	}
////
////
//	@Given("user is navigate to login page")
//	public void user_is_navigate_to_login_page() throws InterruptedException {
//	   HelperClass.openPage(URL);
//	   Thread.sleep(2000);
//	   objBDA.setAdmin();
//	   objBDA.Sigin();
//	}
//
//	@When("user be in birth and death record")
//	public void user_be_in_birth_and_death_record() {
//	    objBDA.BirthAnddeath();
//	}
//
//	@When("user need to click the birth and death record")
//	public void user_need_to_click_the_birth_and_death_record() {
//	   objBDA.BirthAnddeath();
//	}
//
//	@When("user click the birth record")
//	public void user_click_the_birth_record() {
//	    
//	}
//
//	@When("user click the Add birth record")
//	public void user_click_the_add_birth_record() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user enters the require values")
//	public void user_enters_the_require_values() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user need to click save")
//	public void user_need_to_click_save() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
@Given("user is navigate to login page")
public void user_is_navigate_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user need to click the birth and death record")
public void user_need_to_click_the_birth_and_death_record() throws InterruptedException {
	 HelperClass.openPage(URL);
	   Thread.sleep(2000);
	   objBDA.setAdmin();
	   objBDA.Sigin();
	}


@When("user click the birth record")
public void user_click_the_birth_record() {
    // Write code here that turns the phrase above into concrete actions
	 objBDA.BirthAnddeath();
}

@When("user click the Add birth record")
public void user_click_the_add_birth_record() {
	objBDA.clickBirth();
	objBDA.AddbirthRecord();
    
}

@When("user enters the require values")
public void user_enters_the_require_values() {
    objBDA.AddBirthRecord(ChildName, Weight, Birth, CaseId, Phone, AddreSS, Fathername, Report);
}

@Then("user need to click save")
public void user_need_to_click_save() {
    objBDA.AddRecord();
}

	
	
}
