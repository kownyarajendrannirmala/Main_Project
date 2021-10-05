package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login_btn;

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
