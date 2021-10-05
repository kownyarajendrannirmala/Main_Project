package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public Search_hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath = "//option[text()='London']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(name = "room_type")
	private WebElement Roomtype;

	public WebElement getRoomtype() {
		return Roomtype;
	}

	@FindBy(id = "room_nos")
	private WebElement roomnos;

	public WebElement getRoomnos() {
		return roomnos;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkindate;

	public WebElement getCheckindate() {
		return checkindate;
	}

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkoutdate;

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	@FindBy(id = "adult_room")
	private WebElement Adults;

	public WebElement getAdults() {
		return Adults;
	}

	@FindBy(id = "child_room")

	private WebElement childs;

	public WebElement getChilds() {
		return childs;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search_btn;

	public WebElement getsearch_btn() {
		return search_btn;
	}
}
