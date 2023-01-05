package com.saucedemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass_Screenshot 
{

	public static void sshot(WebDriver driver, String name) throws IOException
	{
		Date d = new Date();
		DateFormat simple = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = simple.format(d);
		
	TakesScreenshot ts = (TakesScreenshot)driver;
	File Src = ts.getScreenshotAs(OutputType.FILE);
	File Dst = new File("./Screenshot/"+ name+date+".jpg");
	FileHandler.copy(Src, Dst);
	}
	}
