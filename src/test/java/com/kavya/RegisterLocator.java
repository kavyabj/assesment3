package com.kavya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocator {
 
	@FindBy(xpath ="//*[@id='gender-female']")
  public WebElement gender;
	

	@FindBy(xpath ="//*[@id'FirstName']")
  public WebElement firstname;
	

	@FindBy(xpath =	"//*[@id='LastName']")
	public WebElement lastname;
	
	
	@FindBy(xpath ="//*[@id=\'Email\']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='Password']")
	public WebElement password;
	
	
	@FindBy(xpath="//*[@id=\'ConfirmPassword\']")
	public WebElement compassword;
	
	@FindBy(xpath="//*[@id=\"register-button\']")
	public  WebElement register;

}
