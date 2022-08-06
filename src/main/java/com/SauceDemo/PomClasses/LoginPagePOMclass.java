package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMclass 
{    
	//1)
	WebDriver driver;
//-------------------------------------------------------------------------	
	//2)
	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='login-button']")
	private WebElement loginBtn ;
	//-------------------------------------------------------------------------	
			
	//3) creating constructor with driver args and in this global driver=local driver
	//   After that PageFactory-->init method
	public LoginPagePOMclass (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//-------------------------------------------------------------------------	
		//4) create methods for action on element
	public void SenduserName()
	{
		userName.sendKeys("standard_user");
	}
	
	public void SendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
