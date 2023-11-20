package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="//a[contains(.,'User Login')]")
	public WebElement clickuserLogin;
	@FindBy(xpath="//div[@class='form-group']/following-sibling::button[1]")
	public WebElement clicksignIn;
	@FindBy(xpath ="//span[text()='My Appointments']")
	public WebElement clickmyAppointments;
	@FindBy(xpath = "//a[contains(.,'Add Appointment')]")
	public WebElement clickaddAppointment;
	@FindBy (xpath = "//input[@class='form-control date']")
	public WebElement setDate;
	@FindBy(xpath ="(//td[text()='29'])[2]")
	public WebElement clickDate;
	@FindBy(xpath ="(//select[@class='form-control'])[2]")
	public WebElement selectSpecialist;
	@FindBy(xpath="(//select[@class='form-control'])[3]")
	public WebElement selectDoctor;
	@FindBy(xpath ="(//select[@class='form-control select2'])[1]")
	public WebElement selectShift;
	@FindBy(xpath ="(//select[@class='form-control select2'])[2]")
	public WebElement selectSlot;
	@FindBy(xpath="(//textarea[@class='form-control'])[1]")
	public WebElement setMessage;
	@FindBy(xpath="//select[@id='live_consult']")
	public WebElement setConsultation;
	@FindBy(xpath="//button[contains(@class,'btn btn-info')]")
	public WebElement clickSave;
	@FindBy(xpath ="//i[@class='fa fa-file-pdf-o']")
	public WebElement clicksaveASPDF;
	@FindBy(xpath ="//a[contains(.,'Pharmacy')]")
	public WebElement clickPharmacy;
	@FindBy(xpath="//div[@class='dataTables_filter']//input[1]")
	public WebElement search;
	@FindBy(xpath ="//span[text()=' Pathology']")
	public WebElement pathology;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	public WebElement addTODO;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	public WebElement title;
	@FindBy(xpath="//input[@class='form-control date']")
	public WebElement todoDate;
	@FindBy(xpath ="(//button[contains(@class,'btn btn-primary')])[2]")
	public WebElement save;
}
	
	


