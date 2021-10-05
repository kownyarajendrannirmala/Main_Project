package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked {

	public Booked(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;
	@FindBy(name = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
