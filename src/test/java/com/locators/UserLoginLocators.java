package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginLocators {
	
	//Radiology
	@FindBy(xpath="//span[contains(text(),' Radiology')]")
	public WebElement Radiology;
	
	@FindBy(xpath="//div[@id='testreport_filter']//child::input")
	public WebElement Search;
	
	@FindBy(xpath="//a[@class = 'btn btn-default dt-button buttons-csv buttons-html5']/following-sibling::a[1]/parent::div/child::a[4]")
	public WebElement Pdf;
	
	//Ambulance
	@FindBy(xpath="//span[text()=' Ambulance']")
	public WebElement Ambulance;
	
	@FindBy(className="btn btn-default dt-button buttons-excel buttons-html5")
	public WebElement Excel;
	
	//Bloodbank
	@FindBy(xpath="//li[@class='treeview active']//child::a")
	public WebElement BloodBank;
	
	@FindBy(xpath="//li[@class='active']//child::a")
	public WebElement NextTab;
	
	@FindBy(xpath="(//input[starts-with(@placeholder, 'Search...')])[2]")
	public WebElement SearchField;
	
	//Whatsapp
	@FindBy(xpath="//i[@class='fa fa-whatsapp']//parent::a")
	public WebElement WhatsApp;
	
	@FindBy(xpath="//input[starts-with(@placeholder, 'Write Your Message...')]")
	public WebElement ChatField;
	
	@FindBy(css="button.submit.input_submit")
	public WebElement SendButton;
	
	//Logout
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	public WebElement Profile;
	
	@FindBy(xpath="//a[@class='pull-right']")
	public WebElement Logout;
	

}
