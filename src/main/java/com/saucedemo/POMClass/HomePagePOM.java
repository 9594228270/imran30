package com.saucedemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM 
{
	
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> products;
	@FindBy(xpath= "//span[@class='shopping_cart_badge']")
	WebElement cart;
	public void  AllproductClick()
	{
		for(WebElement few:products)
		{
			few.click();
		}
		
	}
	
	public String cartCheck()
	{
		String Actual =cart.getText();
		return Actual;
		
	}
	public void cartCheck1()
	{
	cart.click();
	}
	
	
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
