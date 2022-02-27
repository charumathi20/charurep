package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	private WebDriver driver;
@FindBy(name="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement room_type;
@FindBy(id="room_nos")
private WebElement numRoom;
@FindBy(name="datepick_in")
private WebElement checkIn;
@FindBy(name="datepick_out")
private WebElement chechOut;
@FindBy(name="adult_room")
private WebElement adultRoom;
@FindBy(name="child_room")
private WebElement childRoom;
@FindBy(name="Submit")
private WebElement searchBt;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getNumRoom() {
	return numRoom;
}
public WebElement getCheckIn() {
	return checkIn;
}
public WebElement getChechOut() {
	return chechOut;
}
public WebElement getAdultRoom() {
	return adultRoom;
}
public WebElement getChildRoom() {
	return childRoom;
}
public WebElement getSearchBt() {
	return searchBt;
}
public SearchHotel(WebDriver driver)

{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

}
