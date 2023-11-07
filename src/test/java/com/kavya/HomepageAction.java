package com.kavya;

import org.openqa.selenium.support.PageFactory;

public class HomepageAction {
	homepageLocators homepageLocators;
	public  void homepage(){
			homepageLocators = new homepageLocators();
			
			PageFactory.initElements(Helper.getDriver(), homepageLocators);
		}
		
		public String getVerifyText() {
			return homepageLocators.register.getText();
		}
	}


