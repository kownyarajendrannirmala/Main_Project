Feature: Hotel Booking in Adactin Application

@smokeTest
Scenario Outline: Login Page
Given User Launch the Application
When User Enter The "<username>" In Username Field
And User Enter The "<password>" In Password Field
Then User Click On The Login Button And It Navigate To Search Hotel Page

Examples:

	|username|password|
	|Kownyaraj|12@1990|
	|Princiya2127|Princi2705|
	|Niveditha|Nive@123|

@sanityTest
Scenario: Search Hotel Page
When User Select The "London"
And User Select The Hotels
And User Select The Room Type
And User Select The Number Of Rooms
And User Select The Check In Date
And User Select The Check In Out
And User Select The Adults Per Room
And User Select The Children Per Room
Then User Click On The Search Button And It Navigate To Select Hotel Page

@sanityTest
Scenario: Select Hotel Page
When User Click The Radio Button To Select A Hotel
Then User Click On the Continue Button And It Navigate to Book A Hotel Page

@sanityTest
Scenario: Book A Hotel Page
When User Enter The Firstname In Firstname Field
And User Enter The Lastname In Lastname Field
And User Enter Billing Address In Billing Address Field
And User Enter Credit Card No In Credit Card No Field
And User Select Credit Card Type 
And User Select Expiry Month
And User Select Select Year
And User Enter CVV Number In CVV Number Field
Then User Click Book Now On Button And It Navigate to Booking Confirmation Page

@sanityTest
Scenario: Booking Confirmation Page
When User Click On The My Itinerary Button And It Navigate To Booked Itinerary Page

@sanityTest
Scenario: Booked Itinerary Page
When User Click On The Logout Button 






















