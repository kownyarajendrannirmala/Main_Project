package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {

	public Booking_Confirm(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath= "//input[@id = 'my_itinerary']")
	private WebElement myitin_btn;

	public WebElement getMyitin_btn() {
		return myitin_btn;
	}

}
