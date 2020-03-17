package com.nearlk.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nearlk.qa.base.BaseTest;
import com.nearlk.qa.pages.HomePage;
import com.nearlk.qa.pages.LoginPage;

public class HomePageTest extends BaseTest{
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	
		intialization();
		loginPage = new LoginPage();
		homePage=new HomePage();
		homePage=loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	test
	@Test(priority=2)
	public void logoTest() throws InterruptedException{
		Thread.sleep(3000);
		String logo=homePage.logo();
		System.out.println(logo);
		Assert.assertEquals(logo, "Nearluk|Rental/Lease Property in India");
	}
	@Test(priority=3)
	public void aboutTest() throws InterruptedException{
		Thread.sleep(3000);
		homePage.about();
	}
	@Test(priority=4)
	public void contactTest() throws InterruptedException{
		Thread.sleep(3000);
		homePage.contact();
	}
	@Test(priority=5)
		public void tearDown(){
			driver.quit();
		
	}
	
	

}
