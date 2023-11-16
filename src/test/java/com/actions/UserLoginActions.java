package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.UserLoginLocators;
import com.utility.HelperClass;

public class UserLoginActions {
	UserLoginLocators objLogin = null;
	
	public UserLoginActions() {
		this.objLogin = new UserLoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), objLogin); //Initiating the driver from helperclass constructor to perform action
	}
	
	

}
