package com.adactin.stepdefination;

import com.AdactinCucumber.com.BaseCucumber;
import com.FileReaderManager.com.File_Reader_Manager;
import com.pomadactin.com.Login;
import com.pomadactin.com.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_Adactin extends BaseCucumber{
	

public static PageObjectManager o=new PageObjectManager(driver); 
	

	@Given("^User launch  the application$")
	public void user_launch_the_application() throws Throwable {
	   urlLaunch("http://adactinhotelapp.com/");
	}

	@When("^User Enter username in the username field$")
	public void user_Enter_username_in_the_username_field() throws Throwable {
		String s=File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_UserName();
	 sendKey(o.get_Instance_Login().getUsername(),s);
	}

	@When("^User enter password in the password field$")
	public void user_enter_password_in_the_password_field() throws Throwable {
		String s=File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Password();
	    sendKey(o.get_Instance_Login().getPassword(),s);
	}

	@Then("^User Click The Login Button And To Navigate Search Hotel Page$")
	public void user_Click_The_Login_Button_And_To_Navigate_Search_Hotel_Page() throws Throwable {
	   clickOnElement(o.get_Instance_Login().getLoginBt());
	}

	@When("^User Selecting The Location from Dropdown$")
	public void user_Selecting_The_Location_from_Dropdown() throws Throwable {
	   dropDown(o.get_Instance_Search().getLocation(), "values", File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Location());
}

@When("^User Selecting The Hotel From Dropdown$")
public void user_Selecting_The_Hotel_From_Dropdown() throws Throwable {
    dropDown(o.get_Instance_Search().getHotels(),"values", File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Hotel());
}

@When("^User Selecting The RoomType From Dropdown$")
public void user_Selecting_The_RoomType_From_Dropdown() throws Throwable {
	dropDown(o.get_Instance_Search().getRoom_type(),"values",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Room_type());
}

@When("^User Selecting The Number Of Rooms From Dropdown$")
public void user_Selecting_The_Number_Of_Rooms_From_Dropdown() throws Throwable {
	dropDown(o.get_Instance_Search().getNumRoom(),"values",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Num_room());
}
@When("^User Enter The Check In Date In ChechIn Field$")
public void user_Enter_The_Check_In_Date_In_ChechIn_Field() throws Throwable {   
	clear(o.get_Instance_Search().getCheckIn());
	sendKey(o.get_Instance_Search().getCheckIn(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_CheckIn());
}

@When("^User Enter The Check Out Date In ChechOut Field$")
public void user_Enter_The_Check_Out_Date_In_ChechOut_Field() throws Throwable {
	clear(o.get_Instance_Search().getChechOut());
	sendKey(o.get_Instance_Search().getChechOut(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_CheckOut());
}

@When("^User Selecting Adult Per Room From Dropdown$")
public void user_Selecting_Adult_Per_Room_From_Dropdown() throws Throwable {
	dropDown(o.get_Instance_Search().getAdultRoom(),"values",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_AdultRoom());
}

@When("^User Selecting Childrens Per Room From Dropdown$")
public void user_Selecting_Childrens_Per_Room_From_Dropdown() throws Throwable {
	dropDown(o.get_Instance_Search().getChildRoom(),"values",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_ChildRoom());
}

@Then("^User Click the Search Button And Navigate To The Select Hotel$")
public void user_Click_the_Search_Button_And_Navigate_To_The_Select_Hotel() throws Throwable {
	clickOnElement(o.get_Instance_Search().getSearchBt());
}

@When("^User Click On The Redio Button$")
public void user_Click_On_The_Redio_Button() throws Throwable {
	clickOnElement(o.get_Instance_Select().getRadioBt());
}

@Then("^User Click The continue Button And Navigate To The Book A Hotel Page$")
public void user_Click_The_continue_Button_And_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
	clickOnElement(o.get_Instance_Select().getClickContinue());
}

@When("^User Enter The FirstName In The Firstname  Field$")
public void user_Enter_The_FirstName_In_The_Firstname_Field() throws Throwable {
	sendKey(o.get_Instance_Book().getFirstname(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_FirstName());
}

@When("^User Enter The Lastname In The Lastname Field$")
public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
	sendKey(o.get_Instance_Book().getLastname(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_LastName());
}

@When("^User Enter The Billing  Address In The Bill Address Field$")
public void user_Enter_The_Billing_Address_In_The_Bill_Address_Field() throws Throwable {
	sendKey(o.get_Instance_Book().getAddress(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Address());
}
@When("^User Enter The CreditCard Number In The CreditCard Field$")
public void user_Enter_The_CreditCard_Number_In_The_CreditCard_Field() throws Throwable {
	 sendKey(o.get_Instance_Book().getCreditCard_num(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Creditcard_Num());
}

@When("^User Selecting The CreditCardType From Dropdown$")
public void user_Selecting_The_CreditCardType_From_Dropdown() throws Throwable {
	dropDown(o.get_Instance_Book().getCreditCard_type(),"text",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_CreditCard_type());
}

@When("^User Selecting The Expire Date And Month$")
public void user_Selecting_The_Expire_Date_And_Month() throws Throwable {
	dropDown(o.get_Instance_Book().getExp_month(),"index",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Exp_month());
	dropDown(o.get_Instance_Book().getExp_year(),"index",File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_Exp_year());
}

@When("^User Enter The CVV number In The Cvv Filed$")
public void user_Enter_The_CVV_number_In_The_Cvv_Filed() throws Throwable {

	sendKey(o.get_Instance_Book().getCcnum(),File_Reader_Manager.get_InstanceFR().get_InstanceCR().get_cc_num());
}

@Then("^User Click ON BookNow Button and  Navigate To Booking  Conformation Page$")
public void user_Click_ON_BookNow_Button_and_Navigate_To_Booking_Conformation_Page() throws Throwable {
	clickOnElement(o.get_Instance_Book().getBookNow());
	wait(driver);
}

@Given("^user Click On the logOut Button$")
public void user_Click_On_the_logOut_Button() throws Throwable {
	clickOnElement(o.get_Instance_Logout().getLogoutBt());
}
}