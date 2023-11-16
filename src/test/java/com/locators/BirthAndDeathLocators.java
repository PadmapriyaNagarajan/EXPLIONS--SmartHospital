package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BirthAndDeathLocators {
	@FindBy(xpath="(//a[@class='btn btn-primary width50'])[1]")
	public WebElement admin;
	@FindBy(xpath="//button[@class='btn']")
	public WebElement signin;
	@FindBy(xpath=" //a[contains(.,'Birth & Death Record')]")
	public WebElement Clickbirthanddeath;
	@FindBy(xpath="//li[@class='active']//a[1]")
	public WebElement clickbirth;
	@FindBy(xpath="//a[contains(text(),'Birth Record')]")
	public WebElement birthrecord;
	@FindBy(xpath="//a[@data-toggle='modal']")
	public WebElement addbirthrecord;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	public WebElement childname;
	@FindBy(xpath="(//label[text()=' Gender']/following-sibling::select)[1]")
	public WebElement gender;
	@FindBy(xpath="(//input[@name='weight'])[1]")
	public WebElement weight;
	@FindBy(xpath="(//input[@name='birth_date'])[1]")
	public WebElement birthdate;
	@FindBy(xpath="(//input[@name='case_id'])[1]")
	public WebElement caseid;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	public WebElement phone;
	@FindBy(xpath="(//input[@name='address'])[1]")
	public WebElement address;
	@FindBy(xpath="(//input[@name='father_name'])[1]")
	public WebElement fathername;
	@FindBy(xpath= "(//label[text()='Report'])[2]/following::textarea")
	public WebElement textarea;
	@FindBy(xpath="//button[@class='btn btn-info']")
	public WebElement savebtn;
	
	
			

}
