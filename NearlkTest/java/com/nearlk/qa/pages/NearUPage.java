package com.nearlk.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nearlk.qa.base.BaseTest;

public class NearUPage extends BaseTest{
	@FindBy(xpath="//button[contains(text(),'NearU')]")
	WebElement nearu;
	@FindBy(xpath="//div[@class='col-md-3']//select[@id='inputfields']")
	WebElement property;
	@FindBy(xpath="//div[@class='col-md-2']//select[@id='inputfields']")
	WebElement kilometer;
	@FindBy(xpath="//input[@id='minprice']")
	WebElement minprice;
	@FindBy(id="maxprice")
	WebElement maxprice;
	@FindBy(id="searchicon")
	WebElement submit;
	@FindBy(xpath="//*[@id='mycard']/div[2]/div/div/table/tbody/tr[5]/td/span")
	WebElement moreDetails;
	
	public NearUPage(){
		PageFactory.initElements(driver, this);
	}
	public void nearu(){
		nearu.click();
		
	}
	public void propperty(){
		Select s=new Select(property);
		s.selectByIndex(6);
	}
	public void kilometer(){
		Select m=new Select(kilometer);
		m.selectByIndex(10);
		
	}
	public void minprice(){
		minprice.sendKeys("50000");
	}
	public void maxprice(){
		maxprice.sendKeys("100000");
	}
	public void submit(){
		submit.click();
	}
	public void moreDetails(){
		moreDetails.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.ScrollBy(0,1000)");
	}
}
