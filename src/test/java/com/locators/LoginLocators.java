package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/site/userlogin']")
	public WebElement clickuserLogin;
	
	@FindBy(xpath="//button[@class='btn']")
	public WebElement clicksignIn;
	
	@FindBy(xpath ="//span[text()='My Appointments']")
	public WebElement clickmyAppointments;
	
	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
	public WebElement clickaddAppointment;
	
	@FindBy (xpath = "//input[@id='dates']")
	public WebElement setDate;
	
	@FindBy(xpath ="//select[@id='specialist']")
	public WebElement selectSpecialist;
	
	@FindBy(xpath="//select[@name='doctor']")
	public WebElement selectDoctor;
	
	@FindBy(xpath ="//select[@name='global_shift']")
	public WebElement selectShift;
	
	@FindBy(xpath ="//select[@id='shift_id']")
	public WebElement selectSlot;
	
	@FindBy(xpath="//textarea[@id='message']")
	public WebElement setMessage;
	
	@FindBy(xpath="//select[@name=\"live_consult\"]")
	public WebElement setConsultation;
	
	@FindBy(id="slot_7")
	public WebElement setSlot;
	
	@FindBy(xpath="//button[@id='formaddbtn']")
	public WebElement clickSave;
	
	@FindBy(xpath= "//input[@type='search']")
	public WebElement search2;
	
	@FindBy(xpath ="//a[@class='btn btn-default dt-button buttons-pdf buttons-html5']")
	public WebElement clicksaveASPDF;
	
	@FindBy(xpath ="//a[@href='https://demo.smart-hospital.in/patient/dashboard/bill']")
	public WebElement clickPharmacy;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement search;
	
	@FindBy(xpath ="//a[@href='https://demo.smart-hospital.in/patient/dashboard/search']")
	public WebElement pathology;
	
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/user/calendar/']")
	public WebElement calender;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm pull-right']")
	public WebElement addTODO;
	
	@FindBy(xpath="//input[@id='task-title']")
	public WebElement title;
	
	@FindBy(xpath="//input[@id='task-date']")
	public WebElement todoDate;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement save;
	//assert locators
	@FindBy(xpath="//span[text()='fdsg']")
	public WebElement valid;
}
	
	


