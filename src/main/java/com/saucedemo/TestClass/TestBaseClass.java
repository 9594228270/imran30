package com.saucedemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.POMClass.POMClass_Verify_Login;
import com.saucedemo.UtilityClass.UtilityClass_Screenshot;

public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log=Logger.getLogger("SauceDemo");
@BeforeMethod

public void CHromeOpen() throws IOException
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	
	PropertyConfigurator.configure("log4j file");
	
	log.info("browser is opened");
					

	driver.manage().window().maximize();
	
	log.info("browser is maximized");

	
	
	driver.get("https://www.saucedemo.com/");
	log.info("url is opened");
	
	UtilityClass_Screenshot.sshot(driver, "LoginPage");
	
	POMClass_Verify_Login ls = new POMClass_Verify_Login(driver);
	ls.usernameenter();
	ls.passwordKeys();
	ls.loginBtClick();
	

}

@AfterMethod

public void ChromeClose()
{
	driver.quit();	
}
}
