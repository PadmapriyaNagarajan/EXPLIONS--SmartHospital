package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.LoginLocators;
import com.stepdefinition.HelperClass;

public class LoginActions {
	LoginLocators logloc;
	Actions act = new Actions (HelperClass.getDriver());
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(15));
	
	public LoginActions() {
		this.logloc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logloc);	
	}
	public void clickloginAction() {
		logloc.clickuserLogin.click();	
	}
	public void clicksigninAction() {
		act.moveToElement(logloc.clicksignIn).click().perform();
		//logloc.clicksignIn.click();
	}
	public void clickmyAppointments() {
		logloc.clickmyAppointments.click();
}
	public void clickaddAppointments() {
		logloc.clickaddAppointment.click();
	}
	public void setDate(String date) {
		logloc.setDate.sendKeys(date);
	}
	public void selectSpecialist() {
		wait.until(ExpectedConditions.visibilityOf(logloc.selectSpecialist)).click();
		Select s=new Select(logloc.selectSpecialist);
				s.selectByIndex(1);
		
	}
	public void selectDoctor() {
		wait.until(ExpectedConditions.visibilityOf(logloc.selectDoctor)).click();
		Select s=new Select(logloc.selectDoctor);
		s.selectByIndex(1);
	}
	public void selectShift() {
		wait.until(ExpectedConditions.visibilityOf(logloc.selectShift)).click();
		Select s=new Select(logloc.selectShift);
		s.selectByIndex(2);
	}
	public void selectSlot() {
		wait.until(ExpectedConditions.visibilityOf(logloc.selectSlot)).click();
		Select s=new Select(logloc.selectSlot);
				s.selectByIndex(1);
		
	}
	public void setMessage(String setMessage) {
		wait.until(ExpectedConditions.visibilityOf(logloc.setMessage)).sendKeys(setMessage);
		logloc.setMessage.sendKeys(setMessage);
	}
	public void setConsultation() {
		wait.until(ExpectedConditions.visibilityOf(logloc.setConsultation)).click();
		Select  s= new Select(logloc.setConsultation);
		s.selectByIndex(0);
	}
	public void setSlot() {
		wait.until(ExpectedConditions.visibilityOf(logloc.setSlot)).click();
		act.moveToElement(logloc.setSlot).click().perform();
		//logloc.setSlot.click();
	}
	public void clickSave() {
		logloc.clickSave.click();
	}
	public void setSearch(String Search1) {
		logloc.search.sendKeys(Search1);
	}
	public void clicksaveAsPDF() {
		logloc.clicksaveASPDF.click();
	}
	public void clickPharmacy() {
		logloc.clickPharmacy.click();
	}
	public void pharmacySearch(String pharma) {
		logloc.search2.sendKeys(pharma);
	}
	
	public void clickpathology() {
		logloc.pathology.click();
	}
	public void clickCalendar() {
		logloc.calender.click();
	}
	public void clickaddtodo() {
		logloc.addTODO.click();
	}
	public void setTitle(String tit) {
		logloc.title.sendKeys(tit);
	}
	public void settododate(String dat) {
		logloc.todoDate.sendKeys(dat);
	}
	public void enterSave() {
		logloc.save.click();
	}
	public String verify() {
		return logloc.valid.getText();
	}
	public  void userloginDetails(String date,String setMessage,String Search1,String tit,String dat) {
		setDate(date);
		setMessage(setMessage);
		setSearch(Search1);
		setTitle(tit);
		settododate(date);
		
		
		
	}
}
