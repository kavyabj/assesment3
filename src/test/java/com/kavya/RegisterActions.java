package com.kavya;

import org.openqa.selenium.support.PageFactory;

public class RegisterActions<RegisterLocators> {
	RegisterLocator RegisterLocator=null;
	 
	public RegisterActions() {
		RegisterLocator = new RegisterLocator();
		PageFactory.initElements(Helper.getDriver(),RegisterLocator);
	}
	public void gender() {
	RegisterLocator.gender.click();
	}
	 
	public void firstName(String strfirstName) {
		RegisterLocator.firstname.sendKeys(strfirstName);
	}
	public void lastName(String strlastName) {
		RegisterLocator.lastname.sendKeys(strlastName);
	}
	public void email(String email) {
		RegisterLocator.email.sendKeys(email);
	}
		public void setPassword(String strPassword) {
			RegisterLocator.password.sendKeys(strPassword);
	}
		public void setconfirmpassword(String strconfirmpassword) {
			RegisterLocator.compassword.sendKeys(strconfirmpassword);
		}
		public void clickregister() {
			RegisterLocator.register.click();
		}
		public void registerInfo(String firstname, String lastName, String password) {
			firstName(firstname);
			setPassword(password);
		}

		
}


