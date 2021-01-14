package com.wurlproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
    WebDriver driver;
    
    public GoogleSearch(WebDriver rdriver){
    	driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(name = "q")
    WebElement txtSearchName;
    
    @FindBy(id="gbqfbb")
    WebElement submitButton; 
    
    public void performSearch(String searchword) {
    	txtSearchName.sendKeys(searchword);
    }
    public void submitSearch() {
    	submitButton.click();
    }
    

}
