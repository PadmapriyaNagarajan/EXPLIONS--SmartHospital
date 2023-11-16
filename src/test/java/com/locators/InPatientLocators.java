package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPatientLocators {
	@FindBy(xpath = "//div[@class='box-tools pull-right']//a[1]")
	WebElement addpatient;
	@FindBy(xpath = "//a[@id='addpip']//span[1]")
	WebElement newPatient;
	@FindBy(xpath = "((//label[text()='Name'])[3]/following::input)[1]")
	WebElement patientName;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	WebElement year;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	WebElement month;
	@FindBy(xpath = "//input[@placeholder='Month']/following-sibling::input[1]")
	WebElement day;
	@FindBy(xpath = "(//button[text()=' Save'])[2]")
	WebElement savePatient;
	@FindBy(xpath = "//label[text()='Admission Date']/following-sibling::input")
	WebElement admissionDate;
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
	WebElement consultantDoctor;
	@FindBy(id = "select2-charge_category-0j-container")
	WebElement betGroup;
	@FindBy(xpath = "//select[@name='bed_group_id']")
	WebElement betNumber;
	@FindBy(xpath = "(//div[@class='pull-right']//button)[3]")
	WebElement save;
}
