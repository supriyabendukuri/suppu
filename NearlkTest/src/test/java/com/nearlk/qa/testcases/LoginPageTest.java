package com.nearlk.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nearlk.qa.base.BaseTest;
import com.nearlk.qa.pages.HomePage;
import com.nearlk.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest(){
		super();
	
		intialization();
		loginPage=new LoginPage();
	}
	@Test(priority=2)
	public void LoginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Nearluk|Rental/Lease Property in India");
	}
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		homePage=loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
	}

	@Test(priority=4)
	public void tearDown(){
		driver.quit();
	
}
	

	
	}



