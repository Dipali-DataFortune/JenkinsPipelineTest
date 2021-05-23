package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.base.TestBase;

public class GoogleTitleVerification extends TestBase {

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchBox;
	
	public void googleTitleTest()
	{
		//driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals("Google", title);
	    
	    System.out.println("Test passed");
	}
	
	public void search()
	{
		searchBox.sendKeys("Automation testing");
	}
}
