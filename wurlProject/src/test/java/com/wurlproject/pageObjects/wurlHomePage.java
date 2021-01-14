package com.wurlproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wurlHomePage {
	 WebDriver driver;
	    
	 public wurlHomePage(WebDriver rdriver){
	    	driver = rdriver;
	    	PageFactory.initElements(rdriver, this);
	    }
	 
	 @FindBy(id="gbqfbb")
	 WebElement requestDemoButton; 
	    
	 public void requestDemo() {
		 requestDemoButton.click();
	 }
	    
}
