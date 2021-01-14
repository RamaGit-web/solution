package com.wurlproject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String GoogleURL = "https://www.google.com/";
	public String wurlBaseURL = "https://www.wurl.com/";
	public String searchKey = "Wurl";
	public static WebDriver driver; 
	
	@BeforeClass 
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
