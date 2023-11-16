package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.locators.BillingLocators;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminLoginStepDefinition  {
	BillingLocators bill;

	public AdminLoginStepDefinition() {
		super();
		bill = new BillingLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
		
	}

	@Given("user enters into the Admin portal")
	public void user_enters_into_the_admin_portal() {
		System.out.println("Admin page ");
		String url = "https://demo.smart-hospital.in/site/login";
		HelperClass.openPage(url);
		HelperClass.driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')]//i)[2]")).click();
		HelperClass.driver.findElement(By.xpath("//div[@class='form-bottom']//button[1]")).click();
		System.out.println("Logged in Successfull");
		
	}

	@Given("user enters into opd")
	public void user_enters_into_opd() {
		System.out.println("1");
		
		
		
	}

	@Given("Added the patient details")
	public void added_the_patient_details() {
		System.out.println("2");
	}

	@Then("Check the patient added")
	public void check_the_patient_added() {
		System.out.println("3");
	}

	@Given("user enter into the FrontOffice")
	public void user_enter_into_the_front_office() {
		System.out.println("4");
	}

	@Given("added the visitors")
	public void added_the_visitors() {
		System.out.println("5");
	}

	@Then("Check the visitors added")
	public void check_the_visitors_added() {
		System.out.println("6");
	}

	@Given("user enter into the OPD-OutPatient")
	public void user_enter_into_the_opd_out_patient() {
		System.out.println("7");
	}
	@Given("Added the op patient details")
	public void added_the_op_patient_details() {
		System.out.println("8");
	}

	@Then("Check the op patient added")
	public void check_the_op_patient_added() {
		System.out.println("9");
	}

	@Given("user enter into the IPD-InPatient")
	public void user_enter_into_the_ipd_in_patient() {
		System.out.println("10");
	}

	@Given("Added the In patient details")
	public void added_the_in_patient_details() {
		System.out.println("11");
	}

	@Then("Check the In patient added")
	public void check_the_in_patient_added() {
		System.out.println("12");
	}
}
