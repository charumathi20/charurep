package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
private	WebDriver driver;
	private Login login;
	private SearchHotel searching;
	private SelectHotel  selecting;
	private BookHotel book;
    private Logout logoutpage;
	
	public Login get_Instance_Login() {
		login=new Login(driver);
		return login;
	}
	public SearchHotel get_Instance_Search() {
		searching=new SearchHotel(driver);
		return searching;
	}
	public SelectHotel get_Instance_Select() {
		selecting=new SelectHotel(driver);
		return selecting;
	}
	public BookHotel get_Instance_Book() {
		book=new BookHotel(driver);
		return book;
	}
	public Logout get_Instance_Logout() {
		logoutpage=new Logout(driver);
		return logoutpage;
	}
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
