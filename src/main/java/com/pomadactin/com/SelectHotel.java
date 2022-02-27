package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	private WebDriver driver;
	@FindBy(name="radiobutton_0")
	private WebElement radioBt;
	@FindBy(name="continue")
	private WebElement clickContinue;

	public WebElement getRadioBt() {
		return radioBt;
	}
	public WebElement getClickContinue() {
		return clickContinue;
	}
	
	public SelectHotel(WebDriver driver)
	{
   this.driver=driver;
   PageFactory.initElements(driver, this);
	}
}