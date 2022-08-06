package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.CartPagePOMclass;
import com.SauceDemo.PomClasses.HomePagePOMclass;
import com.SauceDemo.PomClasses.LoginPagePOMclass;
import com.SauceDemo.UtilityClass.UtilityClass;



public class AddToCart extends TestBaseClass
{
	@Test
	public  void VerifyATCFunctionality() throws IOException, InterruptedException 
	{

		
		HomePagePOMclass HP = new HomePagePOMclass(driver);
		HP.bagPack();
		HP.clickAddToCarTBTN();
		Thread.sleep(5000);
		
		UtilityClass.screenShot(driver);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		CartPagePOMclass cart = new CartPagePOMclass(driver);
		//cart.clickRemoveBTN();
		//Thread.sleep(4000);
		
		UtilityClass.screenShot(driver);
		
		String QTY = cart.cartQTY();
		String ActualQTY = "1";
		Assert.assertEquals(QTY, ActualQTY);
		UtilityClass.screenShot(driver);
		
		
		
	}

}
