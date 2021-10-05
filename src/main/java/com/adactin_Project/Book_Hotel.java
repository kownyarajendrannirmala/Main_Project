package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(id = "address")

	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccno;

	public WebElement getCcno() {
		return ccno;
	}

	@FindBy(id = "cc_type")
	private WebElement cctype;

	public WebElement getcctype() {
		return cctype;
	}

	@FindBy(name = "cc_exp_month")
	private WebElement ccmonth;

	public WebElement getccmonth() {
		return ccmonth;
	}

	@FindBy(xpath = "//option[text()='2022']")
	private WebElement ccyear;

	public WebElement getccyear() {
		return ccyear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement cvv_no;

	public WebElement getcvv_no() {
		return cvv_no;
	}

	@FindBy(name = "book_now")
	private WebElement booknow_btn;

	public WebElement getbooknow_btn() {
		return booknow_btn;
	}

}
