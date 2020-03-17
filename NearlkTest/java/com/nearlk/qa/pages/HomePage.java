package com.nearlk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nearlk.qa.base.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(xpath="//button[contains(text(),'About Us')]")
	WebElement about;
	@FindBy(xpath="//button[contains(text(),' Contact Us ')]")
	WebElement contact;
	@FindBy(xpath="//button[contains(text(),' NearU ')]")
	WebElement nearu;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public String logo(){
		return driver.getTitle();
	}
	public void about(){
		about.click();
	}
	public NearUPage contact(){
		contact.click();
		return new NearUPage();
	}
	
		
	

}
