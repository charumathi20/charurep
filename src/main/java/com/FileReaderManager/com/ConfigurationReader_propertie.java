package com.FileReaderManager.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader_propertie {
  public static Properties p;
  public ConfigurationReader_propertie() throws IOException
  {
  File f=new File("C:\\Users\\valar\\eclipse-workspace\\AdactinHotel\\Configuration\\Configuration.properties");

  FileInputStream fs=new FileInputStream(f);
  p=new Properties();
  p.load(fs);
  
  }
  public String get_url()
  {
	  String url=p.getProperty("url");
	  return url;
  }
  public String get_UserName()
  {
	  String userName=p.getProperty("username");
	return userName;
  }
  public String get_Password()
  {
	  String password=p.getProperty("password");
	return password;
  }
  public String get_Location()
  {
	  String location=p.getProperty("location");
	return location;
  }
  public String get_Hotel()
  {
	  String hotel=p.getProperty("hotel");
	return hotel;
  }
  public String get_Room_type()
  {
	  String room_type=p.getProperty("room_type");
	return room_type;
  }
  public String get_Num_room()
  {
	  String numroom=p.getProperty("numroom");
	return numroom;
  }
  public String get_CheckIn()
  {
	  String checkIn=p.getProperty("checkIn");
	return checkIn;
  }
  public String get_CheckOut()
  {
	  String checkOut=p.getProperty("checkOut");
	return checkOut;
  }
  public String get_AdultRoom()
  {
	  String adultRoom=p.getProperty("adultRoom");
	return adultRoom;
  }
  public String get_ChildRoom()
  {
	  String childRoom=p.getProperty("childRoom");
	return childRoom;
  }
  public String get_FirstName()
  {
	  String firstName=p.getProperty("firstName");
	return firstName;
  }
  public String get_LastName()
  {
	  String lastName=p.getProperty("lastName");
	return lastName;
  }
  public String get_Address()
  {
	  String address=p.getProperty("address");
	return address;
  }
  public String get_Creditcard_Num()
  {
	  String creditCard_Num=p.getProperty("creditCard_num");
	return creditCard_Num ;
  }
  public String get_CreditCard_type()
  {
	  String creditCard_type=p.getProperty("creditCard_type");
	  return creditCard_type;
  }
  public String get_Exp_month()
  {
	  String Exp_month=p.getProperty("Exp_month");
	  return Exp_month;
  }
  public String get_Exp_year()
  {
	  String Exp_year=p.getProperty("Exp_year");
	  return Exp_year;
  }
  public String get_cc_num()
  {
	  String cc_num=p.getProperty("cc_num");
	  return cc_num;
  }
}

