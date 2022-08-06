package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMclass 
{
	WebDriver driver ;
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement setting;
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	
	@FindBy (xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement ATCBagpack;
	
	@FindBy (xpath = "(//button[text()='Add to cart'])[2]")
	private WebElement ATCBikeLight;
	
	@FindBy (xpath = "(//button[text()='Add to cart'])[3]")
	private WebElement ATCBoltTshirt;
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement SauceLabBagPack;
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	private WebElement AddToCarTBTN;
	
	
	public HomePagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void settingBtn()
	{
		setting.click();
	}
	
	public void logOutBtn()
	{
		logOut.click();
	}
	
	public void AtcBoltTshirt()
	{
		ATCBoltTshirt.click();
	}
	
	public void bagPack()
	{
		SauceLabBagPack.click();
	}
	
	public void clickAddToCarTBTN()
	{
		AddToCarTBTN.click();
	}
	
	

}
