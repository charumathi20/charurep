package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	private  WebDriver driver;
@FindBy(name="logout")
private WebElement logoutBt;

public WebElement getLogoutBt() {
	return logoutBt;
}
public Logout(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
