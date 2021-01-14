package com.wurlproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestDemoPage {
	WebDriver driver;
    
	public RequestDemoPage(WebDriver rdriver){
	   driver = rdriver;
	   PageFactory.initElements(rdriver, this);
    }
	
	@FindBy(name="item_meta[93]")
	WebElement firstName;
	
	@FindBy(name="item_meta[94]")
	WebElement lastName;
	
	@FindBy(name="item_meta[95]")
	WebElement emailID;
	
	@FindBy(name="item_meta[96]")
	WebElement subject;
	
	@FindBy(name="item_meta[97]")
	WebElement message;
	
	@FindBy(id="form_contact22")
	WebElement formSubmit;
	
	@FindBy(id="dropdownSolutions")
	WebElement solutionsOp;
	
	@FindBy(linkText="Solutions for\n"+"Video Services")
	WebElement videoservices;
	
	@FindBy(linkText="Expand Channel Lineups")
	WebElement channelLineup;
	
	@FindBy(linkText="Optimize Ad Revenue")
	WebElement OptimizeAdRevenue;
	
	@FindBy(xpath="//*[@id=\"post-306\"]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/h2/span")
	WebElement maxMonitize;
	@FindBy(xpath="//*[@id=\"post-306\"]/div/div/div[2]/div/div/div[2]/div/div/div/div/h2/span")
	WebElement benifits;
	@FindBy(xpath="//*[@id=\"post-306\"]/div/div/div[2]/div/div/div[4]/div/div/div[1]/div/h2/span")
	WebElement atYourService;
	
	
	
	public void isFirstNameDisplayed() {
		firstName.isDisplayed();
	 }
	public void isLastNameDisplayed() {
		lastName.isDisplayed();
	 }
	public void setEmailIDDisplayed() {
		emailID.isDisplayed();
	 }
	public void setsubjectDisplayed() {
		subject.isDisplayed();
	 }
	public void setMessageDisplayed() {
		message.isDisplayed();
	 }
	public void issubmitEnabled() {
		formSubmit.isEnabled();
	 }
	public void solutionsOpclick() {
		solutionsOp.click();
	 }
	public void videoservicesclick() {
		videoservices.click();
	}	
	public void channelLineupPresence() {
		channelLineup.isDisplayed();
	}
	public void OptimizeAdRevenueppresence() {
		OptimizeAdRevenue.isDisplayed();
	}
	public void OptimizeAdRevenuepclick() {
		OptimizeAdRevenue.click();
	}
	
	public String getmaxMonitizeAttribute() {
		return OptimizeAdRevenue.getAttribute("class");
	}
	public String getbenifitsAttribute() {
		return OptimizeAdRevenue.getAttribute("class");
	}
	public String getatYourServiceAttribute() {
		return OptimizeAdRevenue.getAttribute("class");
	}
	
	
	
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	 }
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	 }
	public void setEmailID(String email) {
		emailID.sendKeys(email);
	 }
	public void setsubject(String sub) {
		subject.sendKeys(sub); 
	 }
	public void setMessage(String mess) {
		message.sendKeys(mess);
	 }
	public void submit() {
		formSubmit.click();
	 }
}
