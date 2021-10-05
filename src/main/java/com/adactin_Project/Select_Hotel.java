package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_btn;

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	@FindBy(name = "continue")
	private WebElement continue_btn;

	public WebElement getContinue_btn() {
		return continue_btn;
	}

}
