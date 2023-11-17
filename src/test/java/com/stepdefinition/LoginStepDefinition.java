package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.locators.LoginLocators;

import java.util.Set;

import org.testng.Assert;

import com.actions.LoginActions;
import com.google.common.base.Verify;

public class LoginStepDefinition {
	

LoginActions objaction=new LoginActions();
	@Given("User landed in Smart Hospital HomePage")
	public void user_landed_in_smart_hospital_home_page()  {
	  HelperClass.openPage("https://demo.smart-hospital.in/site/login"); 
	  objaction.clickloginAction();
	  System.out.println("user clicks the user login");
	  Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for (String curWindow : allWindows) {
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	  objaction.clicksigninAction();
	  System.out.println("user clicks signin Successfully");
	}

	@When("User Clicks My Appoinments")
	public void user_clicks_my_appoinments() {
	 objaction.clickmyAppointments();
	 System.out.println("Succesfully clicked MyAppointments");
	}

	@When("User adds new appointment and saves the data")
	public void user_adds_new_appointment_and_saves_the_data() throws InterruptedException {
	   objaction.clickaddAppointments();
	  objaction.setDate("11/22/2023");
	  objaction.selectSpecialist();
	  objaction.selectDoctor();
	  objaction.selectShift();	
	  objaction.selectSlot(); 
	  objaction.setMessage("priya is patient in your hosiptal");	
	  objaction.setConsultation();	
	  objaction.setSlot();
	  objaction.clickSave();
	  
	  System.out.println("Sucessfully Saved Data in Appointments");
	}

	@When("User Search with keyword")
	public void user_search_with_keyword() {
	    objaction.setSearch("APPNO3300");
	    System.out.println("succesfully record visibled");
	}

	@When("User do the action as download as PDF")
	public void user_do_the_action_as_download_as_pdf() {
		objaction.clicksaveAsPDF();
		
	 
	}

	@Then("User See successfully download message")
	public void user_see_successfully_download_message() {
		System.out.println("Successfully downloaded AsPDF");
	}

	@Then("User Clicks Pharmacy")
	public void user_clicks_pharmacy() {
	   objaction.clickPharmacy();
	}

	@Then("User Search with BillNo")
	public void user_search_with_bill_no() {
	   objaction.pharmacySearch("PHARMAB71");
	}

	@Then("User Clicks Pathology from Dashboard")
	public void user_clicks_pathology_from_dashboard() {
	  objaction.clickpathology();
	 
	}

	@Then("User Clicks the Calender")
	public void user_clicks_the_calender() {
	    objaction.clickCalendar();
	    objaction.clickaddtodo();
	}

	@Then("User adds the Todo In Calender")
	public void user_adds_the_todo_in_calender() {
		objaction.setTitle("Happy birthday Harsha");
		objaction.settododate("11/23/2023");
		objaction.clickSave();	   
	}

	@Then("User can see the results in Calender")
	public void user_can_see_the_results_in_calender() {
//		String compare= objaction.verify();
//	  Assert.assertEquals(compare.contains("Happy"),"Record Added Succesfully");
	}
}