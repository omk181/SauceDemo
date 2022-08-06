package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.SauceDemo.PomClasses.LoginPagePOMclass;
import com.SauceDemo.UtilityClass.UtilityClass;

public class TestBaseClass 
{
	 WebDriver  driver;
	@BeforeTest
	public void BeforeTestClass() throws IOException, InterruptedException
	{
System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		UtilityClass.screenShot(driver);
		
        LoginPagePOMclass login = new LoginPagePOMclass(driver);
		
		login.SenduserName();
		Thread.sleep(3000);
		login.SendPassword();
		Thread.sleep(3000);
		login.clickLoginBtn();
		Thread.sleep(9000);
		
		UtilityClass.screenShot(driver);
	}
	
	@AfterTest
	public void AfterTestAnnot()
	{
		driver.close();
		System.out.println("testing is completed");
	}

}
