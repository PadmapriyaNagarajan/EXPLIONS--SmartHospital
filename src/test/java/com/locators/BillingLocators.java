package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingLocators {
	
	@FindBy(xpath = "//i[@class='fas fa-file-invoice']/following-sibling::span[1]")
	WebElement billingButton;
	@FindBy(xpath = "(//div[@class='billingbox text-center']//a)[1]")
	WebElement opd;
	@FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
	WebElement opdAddPatient;
	@FindBy(xpath = "((//label[text()='Name'])[2]/following::input)[1]")
	WebElement name;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	WebElement year;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[2]")
	WebElement month;
	@FindBy(xpath = "//input[@id='age_month']/following-sibling::input[1]")
	WebElement day;
	@FindBy(xpath = "//span[text()='Select']")
	WebElement savePatient;
	@FindBy(xpath = "(//label[text()='Appointment Date']/following::input)[1]")
	WebElement appointmentDate;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[3]")
	WebElement appliedCharges;
	@FindBy(xpath = "//span[text()[normalize-space()='OPD Consultation Fees']]")
	WebElement chargeCatogory;
	@FindBy(xpath = "//span[text()='Select']")
	WebElement charge;
	@FindBy(xpath = "//button[text()=' Save & Print']")
	WebElement SaveAndPrint;
}
