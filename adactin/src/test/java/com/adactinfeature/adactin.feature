Feature: Hotel Booknig In Adactin Application

Scenario: User Login The Web Application
Given User Launch The Adactin Application 
When User Enter The Username in Username Field
And User Enter The Password in Password Field
Then User Click The Login Button And It Navigates To Search Hotel Page

Scenario: User Search The Details and Select The Room In Search Hotels Page
	When User Select The Location
	And User Select The Hotels
	And User Select The Room Type
	And User Select The Number Of Rooms
	And User Select The Check In Date
	And User Select The Check Out Date
	And User Select The Adults Per Room
	And User Select The Children Per Room
	Then User Click The Search Button And It Navigates To Select Hotel Page
	
Scenario: User Check The Details And Confirm The Room In Select Hotel Page
	When User Click The Select Button
	Then User Click the Continue Button And It Navigates To Book A Hotel Page
	
Scenario: User Enter The Details To Book The Room In Book A Hotel Page
	When User Enter The First Name 
	And User Enter The Last Name
	And User Enter The Billing Address
	And User Enter The Credit Card Number
 	And User Select The Credit Card Type
 	And User Select The Month Of The Expiry Year
 	And User Select The Year Of The Expiry Year
 	And User Enter The CVV Number
 	Then User Click Book Now Button And It Navigates To Booking Configuration Page
 	
 Scenario: User Logout In The Iternary Page
 	Then User Click The Logout Button		