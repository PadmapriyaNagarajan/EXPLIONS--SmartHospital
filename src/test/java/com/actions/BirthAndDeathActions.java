package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.BirthAndDeathLocators;
import com.utility.HelperClass;

public class BirthAndDeathActions {
  BirthAndDeathLocators objl=null;
  String URL,ChildName,Weight,Birth,Phone,AddreSS,CaseId,Fathername,Report;
  public BirthAndDeathActions() {
	  this.objl=new BirthAndDeathLocators();
	  PageFactory.initElements(HelperClass.getDriver(), objl);
  }
  public void setAdmin() {
	 objl.admin.click();
  }
  public void Sigin() {
	  objl.signin.click();
  }
  
  public void BirthAnddeath() {
	  objl.Clickbirthanddeath.click();;
  }
  public void clickBirth() {
	  objl.clickbirth.click();
  }
  public void birthRecord() {
	  objl.birthrecord.click();
  }
  public void AddbirthRecord() {
	  objl.addbirthrecord.click();
  }
  public void SetChild(String ChildName) {
	  objl.childname.sendKeys(ChildName);
  }
  public void setGender() {
	  Select s=new Select(objl.gender);
	  s.selectByIndex(1);
  }
  public void SetWeight(String Weight) {
	  objl.weight.sendKeys(Weight);
	  
  }

public void setBirthDate(String Birth) {
	
	objl.birthdate.sendKeys(Birth);
	
}
public void CaseId(String CaseId) {
	objl.caseid.sendKeys(CaseId);
}
public void phonenum(String Phone) {
	objl.phone.sendKeys(Phone);
}
public void SetAddress(String AddreSS) {
	objl.address.sendKeys(AddreSS);
}
public void SetFather(String Fathername) {
	objl.fathername.sendKeys(Fathername);
}


public void TextArea(String Report) {
	objl.textarea.sendKeys(Report);
}
public void AddRecord() {
	objl.savebtn.click();
}
public void AddBirthRecord(String ChildName,String Weight,String Birth,String CaseId,String Phone,String AddreSS,String Fathername,String Report) {
	
	SetChild(ChildName);
	setGender();
	SetWeight(Weight);
	setBirthDate(Birth);
	CaseId(CaseId);
	phonenum(Phone);
	SetAddress(AddreSS);
	SetFather(Fathername);
	TextArea(Report);
	
	
}
}