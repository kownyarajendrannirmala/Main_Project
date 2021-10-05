package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin_Project.Base_Class;
import com.helper.File_Reader_Manager;
import com.testrunner.Test_Runner;

import PageObMa.Page_Object_Manager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_Class {
	

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Before
	public static void beforeHooks(Scenario s) throws Throwable  {
		System.out.println("Before Hooks");
		String status = s.getStatus();
		System.out.println("Status: "+status);
		if (s.isFailed()) {
		Takescreenshot("path");
		}
	}
	
	@After
	public static void afterHooks(Scenario s) throws Throwable {
	System.out.println("Before Hooks");
	String status = s.getStatus();
	System.out.println("Status: "+status);
	if (s.isFailed()) {
	Takescreenshot("path");
	}
}
	

	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		geturl(url);

	}

	@When("^User Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		InputValueElement(pom.getInstanceLP().getUsername(), username);
		
	}

	@When("^User Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		InputValueElement(pom.getInstanceLP().getPassword(), password);
	}


	
//	@When("^User Enter The User name In Username Field$")
//	public void user_Enter_The_User_name_In_Username_Field() throws Throwable {
//
//		String username = Read_Particular_Data("C:\\Users\\Kownya\\Desktop\\adactin_Testcase.xlsx", 1, 5);
//		InputValueElement(pom.getInstanceLP().getUsername(), username);
//
//	}
//
//	@When("^User Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//
//		String password = Read_Particular_Data("C:\\Users\\Kownya\\Desktop\\adactin_Testcase.xlsx", 2, 5);
//		InputValueElement(pom.getInstanceLP().getPassword(), password);
//
//	}

	@Then("^User Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLP().getLogin_btn());
		Thread.sleep(1000);
	}
	
	
	@When("^User Select The \"([^\"]*)\"$")
	public void user_Select_The(String location) throws Throwable {
		
		clickOnElement(pom.getInstanceSH().getLocation());
	}

//	@When("^User Select The Location$")
//	public void user_Select_The_Location() throws Throwable {
//		clickOnElement(pom.getInstanceSH().getLocation());
//
//	}

	@When("^User Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		selectby(pom.getInstanceSH().getHotels(), "index", "3");

	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		selectby(pom.getInstanceSH().getRoomtype(), "index", "2");

	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		selectby(pom.getInstanceSH().getRoomnos(), "index", "2");

	}

	@When("^User Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		InputValueElement(pom.getInstanceSH().getCheckindate(), "26/09/2021");

	}

	@When("^User Select The Check In Out$")
	public void user_Select_The_Check_In_Out() throws Throwable {
		InputValueElement(pom.getInstanceSH().getCheckoutdate(), "28/09/2021");

	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		selectby(pom.getInstanceSH().getAdults(), "index", "2");

	}

	@When("^User Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		selectby(pom.getInstanceSH().getChilds(), "index", "3");

	}

	@Then("^User Click On The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSH().getsearch_btn());

	}

	@When("^User Click The Radio Button To Select A Hotel$")
	public void user_Click_The_Radio_Button_To_Select_A_Hotel() throws Throwable {
		clickOnElement(pom.getinstanceSelect_H().getRadio_btn());

	}

	@Then("^User Click On the Continue Button And It Navigate to Book A Hotel Page$")
	public void user_Click_On_the_Continue_Button_And_It_Navigate_to_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.getinstanceSelect_H().getContinue_btn());
		Thread.sleep(1000);

	}

	@When("^User Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		InputValueElement(pom.getInstanceBH().getFirstname(), "Kownya");

	}

	@When("^User Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		InputValueElement(pom.getInstanceBH().getLastname(), "raj");

	}

	@When("^User Enter Billing Address In Billing Address Field$")
	public void user_Enter_Billing_Address_In_Billing_Address_Field() throws Throwable {
		InputValueElement(pom.getInstanceBH().getAddress(), "chennai");

	}

	@When("^User Enter Credit Card No In Credit Card No Field$")
	public void user_Enter_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		InputValueElement(pom.getInstanceBH().getCcno(), "1234567890123456");

	}

	@When("^User Select Credit Card Type$")
	public void user_Select_Credit_Card_Type() throws Throwable {
		selectby(pom.getInstanceBH().getcctype(), "index", "1");

	}

	@When("^User Select Expiry Month$")
	public void user_Select_Expiry_Month() throws Throwable {
		selectby(pom.getInstanceBH().getccmonth(), "index", "12");

	}

	@When("^User Select Select Year$")
	public void user_Select_Select_Year() throws Throwable {
		clickOnElement(pom.getInstanceBH().getccyear());
	}

	@When("^User Enter CVV Number In CVV Number Field$")
	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
		InputValueElement(pom.getInstanceBH().getcvv_no(), "1233");

	}

	@Then("^User Click Book Now On Button And It Navigate to Booking Confirmation Page$")
	public void user_Click_Book_Now_On_Button_And_It_Navigate_to_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getInstanceBH().getbooknow_btn());
		waitTime_sec(30);

	}

	@When("^User Click On The My Itinerary Button And It Navigate To Booked Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page() throws Throwable {
		clickOnElement(pom.getInstanceBC().getMyitin_btn());
		waitTime_sec(10);

	}

	@When("^User Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
		clickOnElement(pom.getInstanceBKD().getLogout());
		waitTime_sec(10);

	}

}
