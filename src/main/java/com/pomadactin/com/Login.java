package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
private WebDriver driver;
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
private WebElement loginBt;
  
  public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginBt() {
	return loginBt;
}
public Login(WebDriver driver)

{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

}
