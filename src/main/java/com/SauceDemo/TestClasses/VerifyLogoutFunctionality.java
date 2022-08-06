package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePOMclass;
import com.SauceDemo.PomClasses.LoginPagePOMclass;



public class VerifyLogoutFunctionality extends TestBaseClass
{
	@Test 
	public  void VerifyLogoutFunctionality() throws InterruptedException 
	{

		HomePagePOMclass logout = new HomePagePOMclass(driver);
		logout.settingBtn();
		Thread.sleep(5000);
		logout.logOutBtn();
		Thread.sleep(5000);
		
		String ActualUrl = driver.getCurrentUrl();
		Thread.sleep(5000);
		String ExpectedUrl = "https://www.saucedemo.com/";
		Assert.assertEquals(ExpectedUrl, ActualUrl);
		
	}

}
