$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/features/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "Kownyaraj",
        "12@1990"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "Princiya2127",
        "Princi2705"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "Niveditha",
        "Nive@123"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15773600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"Kownyaraj\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"12@1990\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Launch_the_Application()"
});
formatter.result({
  "duration": 4699991300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kownyaraj",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 230755600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12@1990",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 153601100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1968311300,
  "status": "passed"
});
formatter.after({
  "duration": 412800,
  "status": "passed"
});
formatter.before({
  "duration": 324800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"Princiya2127\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Princi2705\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Launch_the_Application()"
});
formatter.result({
  "duration": 543540400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Princiya2127",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 155355100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Princi2705",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 113221000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1681244200,
  "status": "passed"
});
formatter.after({
  "duration": 306600,
  "status": "passed"
});
formatter.before({
  "duration": 344000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"Niveditha\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"Nive@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Launch_the_Application()"
});
formatter.result({
  "duration": 395047800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Niveditha",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 165227000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nive@123",
      "offset": 16
    }
  ],
  "location": "Step_Def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 127410400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1660497100,
  "status": "passed"
});
formatter.after({
  "duration": 253100,
  "status": "passed"
});
formatter.before({
  "duration": 328600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User Select The \"London\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User Select The Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Select The Check In Out",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Click On The Search Button And It Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 17
    }
  ],
  "location": "Step_Def.user_Select_The(String)"
});
formatter.result({
  "duration": 139309800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Hotels()"
});
formatter.result({
  "duration": 370440300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 261018300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 327794200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 138063000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Check_In_Out()"
});
formatter.result({
  "duration": 142100700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 234653300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 255489200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 576306700,
  "status": "passed"
});
formatter.after({
  "duration": 114400,
  "status": "passed"
});
formatter.before({
  "duration": 130500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User Click The Radio Button To Select A Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User Click On the Continue Button And It Navigate to Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Click_The_Radio_Button_To_Select_A_Hotel()"
});
formatter.result({
  "duration": 127263800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_the_Continue_Button_And_It_Navigate_to_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1592205600,
  "status": "passed"
});
formatter.after({
  "duration": 139400,
  "status": "passed"
});
formatter.before({
  "duration": 139000,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enter Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter Credit Card No In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User Select Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User Select Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Select Select Year",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User Enter CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Click Book Now On Button And It Navigate to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 166789200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 156169000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 139243600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 148197900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Credit_Card_Type()"
});
formatter.result({
  "duration": 185114600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Expiry_Month()"
});
formatter.result({
  "duration": 382629000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_Select_Year()"
});
formatter.result({
  "duration": 79168700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 122362500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_Book_Now_On_Button_And_It_Navigate_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 142997500,
  "status": "passed"
});
formatter.after({
  "duration": 147900,
  "status": "passed"
});
formatter.before({
  "duration": 147800,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User Click On The My Itinerary Button And It Navigate To Booked Itinerary Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 6592371500,
  "status": "passed"
});
formatter.after({
  "duration": 179300,
  "status": "passed"
});
formatter.before({
  "duration": 158400,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Booked Itinerary Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booked-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "User Click On The Logout Button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Def.user_Click_On_The_Logout_Button()"
});
formatter.result({
  "duration": 630128300,
  "status": "passed"
});
formatter.after({
  "duration": 133900,
  "status": "passed"
});
});