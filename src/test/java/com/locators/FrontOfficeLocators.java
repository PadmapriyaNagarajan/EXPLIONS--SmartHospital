package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontOfficeLocators {
	@FindBy(xpath = "(//div[@class='box-tools pull-right']//a)[1]")
	WebElement addVisitors;
	
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[2]")
	WebElement patientName;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::select)[2]")
	WebElement purpose;
	@FindBy(xpath = "(//label[text()='Date']/following-sibling::input)[2]")
	WebElement date;
	@FindBy(xpath = "(//div[@class='modal-footer']//button)[2]")
	WebElement save;
	
}
