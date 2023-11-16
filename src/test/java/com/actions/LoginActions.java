package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginLocators;
import com.utility.HelperClass;

public class LoginActions {
	LoginLocators logloc;
	public LoginActions() {
		this.logloc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logloc);	
	}
	public void clickloginAction() {
		logloc.clickuserLogin.click();	
	}
	public void clicksigninAction() {
		logloc.clicksignIn.click();
	}
	public void clickmyAppointments() {
		logloc.clickmyAppointments.click();
}
	public void clickaddAppointments() {
		logloc.clickaddAppointment.click();
	}
	public void setDate() {
		logloc.setDate.click();
	}
	public void clickDate(String date1) {
		logloc.clickDate.sendKeys(date1);
	}
	public void selectSpecialist(String setspecialist) {
		logloc.selectSpecialist.sendKeys(setspecialist);
	}
	public void selectDoctor(String setdoctor) {
		logloc.selectDoctor.sendKeys(setdoctor);	
	}
	public void selectShift(String setShift) {
		logloc.selectShift.sendKeys(setShift);
	}
	public void selectSlot(String setSlot) {
		logloc.selectSlot.sendKeys(setSlot);
	}
	public void setMessage(String setMessage) {
		logloc.setMessage.sendKeys(setMessage);
	}
	public void setConsultation(String setConsultation) {
		logloc.setConsultation.sendKeys(setConsultation);
	}
	public void clickSave() {
		logloc.clickSave.click();
	}
	public void clicksaveAsPDF() {
		logloc.clicksaveASPDF.click();
	}
	public void clickPharmacy() {
		logloc.clickPharmacy.click();
	}
	public void setSearch(String Search1) {
		logloc.search.sendKeys(Search1);
	}
	public void pathology() {
		logloc.pathology.click();
	}
	public void addtodo() {
		logloc.addTODO.click();
	}
	public void title(String tit) {
		logloc.title.sendKeys(tit);
	}
	public void tododate(String dat) {
		logloc.todoDate.sendKeys(dat);
	}
	public void enterSave() {
		logloc.save.click();
	}
}
