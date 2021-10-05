package PageObMa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin_Project.Book_Hotel;
import com.adactin_Project.Booked;
import com.adactin_Project.Booking_Confirm;
import com.adactin_Project.Login_Page;
import com.adactin_Project.Search_hotel;
import com.adactin_Project.Select_Hotel;

public class Page_Object_Manager {
	
	
	public WebDriver driver;
	private Login_Page lp;
	private Search_hotel sh;
	private Select_Hotel select_h;
	private Book_Hotel bh;
	private Booked bkd;
	private Booking_Confirm bc;

	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	public Login_Page getInstanceLP() {
		lp = new Login_Page(driver);
		return lp;
	}
	
	public Search_hotel getInstanceSH() {
		sh = new Search_hotel(driver);
		return sh;
	}
	
	
	public Select_Hotel getinstanceSelect_H() {
		select_h = new Select_Hotel(driver);
		return select_h;
	}
	
	
	public Book_Hotel getInstanceBH() {
		bh = new Book_Hotel(driver);
		return bh;
	}
	
	public Booked getInstanceBKD() {
		bkd = new Booked(driver);
		return bkd;
	}
	
	public Booking_Confirm getInstanceBC() {
		bc = new Booking_Confirm(driver);
		return bc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
