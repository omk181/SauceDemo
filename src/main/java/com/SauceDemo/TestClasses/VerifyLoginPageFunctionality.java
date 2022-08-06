package com.SauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;





public final class VerifyLoginPageFunctionality extends TestBaseClass
{

		@Test
		public void CheckLoginFunctionality( ) throws InterruptedException
		{
		String ExpectedUrl = "https://www.saucedemo.com/inventory.html";
		String ActualUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		
		}
	

}
