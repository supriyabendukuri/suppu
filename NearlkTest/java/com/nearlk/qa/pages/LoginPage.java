package com.nearlk.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nearlk.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="pwd")
	WebElement password;
	@FindBy(xpath="//button[@id='submitbtn']")
	WebElement submit;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}

	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public HomePage Login(String ur,String pwd){
		username.sendKeys(ur);
		password.sendKeys(pwd);
		submit.click();
		return new HomePage();
	}

	

}
