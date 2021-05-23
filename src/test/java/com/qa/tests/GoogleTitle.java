package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.GoogleTitleVerification;

public class GoogleTitle extends TestBase{

	public GoogleTitle()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifygoogleTitleTest()throws InterruptedException {
		GoogleTitleVerification gt = PageFactory.initElements(driver,GoogleTitleVerification.class);
		gt.googleTitleTest();
	}
	
	@Test(priority = 1, enabled=true)
	public void verifysearch()throws InterruptedException {
		GoogleTitleVerification gt = PageFactory.initElements(driver,GoogleTitleVerification.class);
		gt.search();
	}
}
	
