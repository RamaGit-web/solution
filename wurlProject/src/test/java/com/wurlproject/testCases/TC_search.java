package com.wurlproject.testCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wurlproject.pageObjects.GoogleSearch;
import com.wurlproject.pageObjects.RequestDemoPage;

public class TC_search extends BaseClass{
	static RequestDemoPage rp = new RequestDemoPage(driver);
	GoogleSearch gs = new GoogleSearch(driver);

	@Test
	public void searchTest() {
		driver.get(GoogleURL);
		gs.performSearch(searchKey);
		gs.submitSearch();
		
		if(driver.getTitle().equals("Home | Wurl")) {
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public static void formTest() {
		rp.isFirstNameDisplayed();
		rp.isLastNameDisplayed();
		rp.setEmailIDDisplayed();
		rp.setsubjectDisplayed();
		rp.setMessageDisplayed();
		rp.issubmitEnabled();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("/Users/ramadeviharikrishnen/eclipse-workspace/wurlProject/ScreenShot"+"wurl.jpeg");
		FileUtils.copyFile(file,destFile);
	}
	
	@Test
	public void solutionsCheckTest(){ 
		rp.solutionsOpclick();
		rp.videoservicesclick();
		rp.channelLineupPresence();
		rp.OptimizeAdRevenueppresence();
		rp.OptimizeAdRevenuepclick();
		
		if(driver.getTitle().equals("Optimize Ad Revenue | Wurl")) {
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertTrue(false);
		}		
	}
	
	public void adRevenueTest() {
		String maxMonitizeattributeValue = rp.getmaxMonitizeAttribute();
		Assert.assertEquals(maxMonitizeattributeValue, "fl-heading-text");
		
		String benifitsattributeValue = rp.getbenifitsAttribute();
		Assert.assertEquals(benifitsattributeValue, "fl-heading-text");
		
		String atYourServiceattributeValue = rp.getatYourServiceAttribute();
		Assert.assertEquals(atYourServiceattributeValue, "fl-heading-text");
	}

}
