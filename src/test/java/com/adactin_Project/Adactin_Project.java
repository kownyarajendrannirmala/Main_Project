package com.adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper.File_Reader_Manager;

import PageObMa.Page_Object_Manager;

public class Adactin_Project extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		File_Reader_Manager.getInstance();
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		geturl(url);

		String username = Read_Particular_Data("C:\\Users\\Kownya\\Desktop\\adactin_Testcase.xlsx", 1, 5);
		InputValueElement(pom.getInstanceLP().getUsername(), username);

		String password = Read_Particular_Data("C:\\Users\\Kownya\\Desktop\\adactin_Testcase.xlsx", 2, 5);
		InputValueElement(pom.getInstanceLP().getPassword(), password);

		clickOnElement(pom.getInstanceLP().getLogin_btn());

		Thread.sleep(1000);

		clickOnElement(pom.getInstanceSH().getLocation());

		selectby(pom.getInstanceSH().getHotels(), "index", "3");

		selectby(pom.getInstanceSH().getRoomtype(), "index", "2");

		selectby(pom.getInstanceSH().getRoomnos(), "index", "2");

//		Javascriptvaluepass("arguments[0],value='25/09/2021;",pom.getInstanceSH().getCheckindate());
//		Javascriptvaluepass("arguments[0],value='28/09/2021", pom.getInstanceSH().getCheckoutdate());

		InputValueElement(pom.getInstanceSH().getCheckindate(), "26/09/2021");
		InputValueElement(pom.getInstanceSH().getCheckoutdate(), "28/09/2021");

		waitTime_sec(20);

		selectby(pom.getInstanceSH().getAdults(), "index", "2");

		selectby(pom.getInstanceSH().getChilds(), "index", "3");

		waitTime_sec(20);
		scrollUp();
		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture.png");

		clickOnElement(pom.getInstanceSH().getsearch_btn());

		clickOnElement(pom.getinstanceSelect_H().getRadio_btn());

		waitTime_sec(10);
		scrollUp();

		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture1.png");

		clickOnElement(pom.getinstanceSelect_H().getContinue_btn());

		InputValueElement(pom.getInstanceBH().getFirstname(), "Kownya");

		InputValueElement(pom.getInstanceBH().getLastname(), "raj");
		InputValueElement(pom.getInstanceBH().getAddress(), "chennai");

		InputValueElement(pom.getInstanceBH().getCcno(), "1234567890123456");

		selectby(pom.getInstanceBH().getcctype(), "index", "1");

		selectby(pom.getInstanceBH().getccmonth(), "index", "12");

		clickOnElement(pom.getInstanceBH().getccyear());
		InputValueElement(pom.getInstanceBH().getcvv_no(), "1233");

		waitTime_sec(20);
		scrollDown();
		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture2.png");

		clickOnElement(pom.getInstanceBH().getbooknow_btn());

		waitTime_sec(20);
		scrollUp();
		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture3.png");
		scrollDown();
		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture4.png");

		clickOnElement(pom.getInstanceBC().getMyitin_btn());

		waitTime_sec(20);
		scrollDown();

		Takescreenshot("C:\\Users\\Kownya\\eclipse-workspace\\project\\Screenshots\\picture5.png");
		
		waitTime_sec(10);

		clickOnElement(pom.getInstanceBKD().getLogout());

		quit();

	}

}
