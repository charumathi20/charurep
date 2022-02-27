Feature: Adactin Hotel Booking Application
Scenario: Sing In to  LogIn page
Given User launch  the application
When User Enter username in the username field
And User enter password in the password field
Then User Click The Login Button And To Navigate Search Hotel Page

Scenario: User Searching The Hotel 
 When User Selecting The Location from Dropdown
 And User Selecting The Hotel From Dropdown
 And User Selecting The RoomType From Dropdown
And User Selecting The Number Of Rooms From Dropdown
And User Enter The Check In Date In ChechIn Field
And User Enter The Check Out Date In ChechOut Field
And User Selecting Adult Per Room From Dropdown
And User Selecting Childrens Per Room From Dropdown
Then User Click the Search Button And Navigate To The Select Hotel 

Scenario: User Select The Hotel
When User Click On The Redio Button
Then User Click The continue Button And Navigate To The Book A Hotel Page

Scenario: User Book The Hotel
 When User Enter The FirstName In The Firstname  Field
 And  User Enter The Lastname In The Lastname Field
 And  User Enter The Billing  Address In The Bill Address Field
 And   User Enter The CreditCard Number In The CreditCard Field
 And User Selecting The CreditCardType From Dropdown
 And User Selecting The Expire Date And Month
 And  User Enter The CVV number In The Cvv Filed
 Then User Click ON BookNow Button and  Navigate To Booking  Conformation Page
 
 Scenario: User Enter Into The Booking  Conformation Page
 And user Click On the logOut Button  
 