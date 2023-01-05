package com.saucedemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMClass.HomePagePOM;

public class TestClass_Verify_Login_functinality extends TestBaseClass
{
 
@Test(priority = 1)


	public void LOginPageFun() throws IOException
	{
	String givenTitle = "Swag Labs";   		
	String actualTitle = driver.getTitle();
					
	if(givenTitle.equals(actualTitle))
	{
		System.out.println("LogOut Test is passed");
	}
	else
	{
		System.out.println("LogOut Test is failed");
	}
	
	}
@Test(priority = 2)
public void HomePage()
{
	HomePagePOM hm = new HomePagePOM(driver);
	hm.AllproductClick();
	
	String Expected = "6";
	String Actual = hm.cartCheck();
	if(Actual.equals(Expected))
	{
		System.out.println("Test is passed");	
	}
	else
	{
		System.out.println("Test is failed");	
    }

}
}
