package com.saucedemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMClass_Verify_Login 
{
	WebDriver driver;	
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	public void usernameenter()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBt;
	
	public void passwordKeys()
	{
		password.sendKeys("secret_sauce");
	}

	public void loginBtClick()
	{
		loginBt.click();
	}
	
	public POMClass_Verify_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}

