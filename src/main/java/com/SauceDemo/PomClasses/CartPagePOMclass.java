package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMclass 
{
	WebDriver driver;
	
	@FindBy (xpath = "//button[@id='continue-shopping']")
	private WebElement continueShoppingBTN;
	
	@FindBy (xpath = "//button[@id='remove-sauce-labs-backpack']")
	private WebElement RemoveBTN;
	
	@FindBy (xpath = "//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy (xpath = "//div[@class='cart_quantity']")
	private WebElement cartQTY;
	
	public CartPagePOMclass(WebDriver driver)
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickContinueShoppingBTN()
	{
		continueShoppingBTN.click();
	}
	
	public void clickRemoveBTN()
	{
		RemoveBTN.click();
	}
	
	public void checkoutBTN()
	{
		checkout.click();
	}
	
	public String cartQTY()
	{
		String qty = cartQTY.getText();
		return qty;
	}
	


}
