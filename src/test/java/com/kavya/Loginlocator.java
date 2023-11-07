package com.kavya;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginlocator {
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement login;
	
	@FindBy(xpath="//*[@id='Email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='Password']")
	public WebElement password;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public WebElement clicklogin;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement SuccessMessage;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")
	WebElement ErrorMessage;
 
	
	

}
