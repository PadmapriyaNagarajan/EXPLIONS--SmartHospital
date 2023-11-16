package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutPatientLocators {
	@FindBy(xpath = "//div[@class='box-tools addmeeting']//a[1]")
	WebElement addpatient;
	@FindBy(xpath = "//div[contains(@class,'col-lg-2 col-md-2')]//a[1]")
	WebElement newPatient;
	@FindBy(xpath = "((//label[text()='Name'])[2]/following::input)[1]")
	WebElement patientName;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	WebElement year;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[2]")
	WebElement month;
	@FindBy(xpath = "//input[@placeholder='Month']/following-sibling::input[1]")
	WebElement day;
	@FindBy(xpath = "//input[@placeholder='Month']/following-sibling::input[1]")
	WebElement savePatient;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[1]")
	WebElement apointmentDate;
	
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
	WebElement consultantDoctor;
	@FindBy(id = "select2-charge_category-0j-container")
	WebElement chargeCatogory;
	@FindBy(xpath = "//span[@id='select2-charge_id-kk-container']")
	WebElement charge;
	@FindBy(xpath = "//label[text()='Applied Charge ($)']/following-sibling::input")
	WebElement Appliedcharges;
	@FindBy(xpath = "//label[text()='Paid Amount ($)']/following-sibling::input")
	WebElement paidAmount;
	@FindBy(xpath = "//button[text()=' Save & Print']")
	WebElement saveAndPrint;
}
