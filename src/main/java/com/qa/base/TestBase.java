package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static String currentDirectory = System.getProperty("user.dir");
	
	public TestBase() {
		
		  try { 
			  prop = new Properties(); 
			  FileInputStream IP = new FileInputStream("C:\\Users\\Dipali.vaidya\\cucumberworkspace\\GoogleTitleTest\\config.properties"); 
			  prop.load(IP); }
		  catch (FileNotFoundException e) 
		  { 
			  e.printStackTrace(); 
			  } catch (IOException e)
		  { 
				  e.printStackTrace(); 
				  }
		 
	}

	@BeforeSuite

	public void OpenBrowser() throws InterruptedException {
		//String browser = prop.getProperty("browser");
		//if (browser.equals("chrome")) 
		{

			// System.setProperty("webdriver.chrome.driver", currentDirectory +
			// "\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dipali.vaidya\\Documents\\ChromeDriver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
			System.out.println("Chrome browser opened successfully");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	@AfterSuite()
	public void finish() {
		driver.quit();
	}
}
