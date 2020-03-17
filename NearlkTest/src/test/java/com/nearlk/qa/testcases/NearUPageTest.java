package com.nearlk.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nearlk.qa.base.BaseTest;
import com.nearlk.qa.pages.HomePage;
import com.nearlk.qa.pages.LoginPage;
import com.nearlk.qa.pages.NearUPage;

public class NearUPageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	NearUPage nearuPage;

	public NearUPageTest() {
		super();

		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		nearuPage = new NearUPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void nearuTest() throws InterruptedException {
		Thread.sleep(3000);
		nearuPage.nearu();
	}

	@Test(priority = 2)
	public void propertyTest() {
		nearuPage.propperty();
	}

	@Test(priority = 3)
	public void kilometerTest() {
		nearuPage.kilometer();
	}

	@Test(priority = 4)
	public void minpriceTest() {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='minprice']")));
		
		
		
		
		
		nearuPage.kilometer();
	}

	@Test(priority = 5)
	public void maxpriceTest() {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='maxprice']")));
		nearuPage.maxprice();
	}

	@Test(priority = 6)
	public void submitTest() {
		WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='searchicon']")));
		nearuPage.submit();
	}
	@Test(priority=7)
	public void MoreDetailsTest(){
		nearuPage.moreDetails();
	}
	/*@Test(priority = 7)
	public void tearDown() {
		driver.quit();
	}*/
	
	
	
	

}
