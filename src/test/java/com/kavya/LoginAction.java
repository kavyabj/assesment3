package com.kavya;

import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	
	
		Loginlocator Loginlocators=null;
		 
		public LoginAction() {
			Loginlocators = new Loginlocator();
			PageFactory.initElements(Helper.getDriver(),Loginlocators);
		}
	
			public void email(String email) {
				Loginlocators.email.sendKeys(email);
			}
				public void setPassword(String strPassword) {
					Loginlocators.password.sendKeys(strPassword);
					
				}
					public void login() {
						Loginlocators.login.click();
					}
					
					public void info(String email,String strpassword) {
					email(email);
					setPassword(strpassword);
					}
}
				
				
	

		
