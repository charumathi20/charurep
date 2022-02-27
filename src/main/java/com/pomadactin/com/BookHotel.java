package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	private WebDriver driver;
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement creditCard_num;
	@FindBy(name="cc_type")
	private WebElement creditCard_type;
	@FindBy(name="cc_exp_month")
	private WebElement exp_month;
	@FindBy(name="cc_exp_year")
	private WebElement exp_year;
	@FindBy(name="cc_cvv")
	private WebElement ccnum;
	@FindBy(name="book_now")
	private WebElement bookNow;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCard_num() {
		return creditCard_num;
	}
	public WebElement getCreditCard_type() {
		return creditCard_type;
	}
	public WebElement getExp_month() {
		return exp_month;
	}
	public WebElement getExp_year() {
		return exp_year;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public BookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

}
