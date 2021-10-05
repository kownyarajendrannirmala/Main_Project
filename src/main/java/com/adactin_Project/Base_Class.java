package com.adactin_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	public static String value;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		System.out.println(driver.getTitle());
	}

	public static void getattribute(WebElement element, String name) {
		System.out.println(element.getAttribute(name));
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateback() {
		driver.navigate().back();

	}

	public static void navigateforward() {
		driver.navigate().forward();

	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void InputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void close() {
		driver.close();
	}

	public static void waitTime_sec(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	public static void Dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void ScrollView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	
	public static void Javascriptvaluepass(String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, element);
	}
	
	

	public static void Switchframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void exitframe() {
		driver.switchTo().defaultContent();
	}

	public static void Takescreenshot(String path) throws IOException {
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

	public static String getValues(WebElement element) {
		String text = element.getText();
		return text;
	}

	// Boolean methods
	public static void isdisplayed(WebElement element, String Options) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void isselected(WebElement element, String Options) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void isenabled(WebElement element, String Options) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement values : options) {
			String text = values.getText();
		}
	}

	public static void getalloptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement optionlist : allSelectedOptions) {
			System.out.println(optionlist.getText());
		}
	}

	public static void firstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void ismultiple(WebElement element, String options) {
		Select s = new Select(element);
		boolean options1 = s.isMultiple();

	}

	public static void deselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// alert

	public static void simplealert(String type, String keys) {
		if (type.equalsIgnoreCase("Simple alert")) {
			Alert simple = driver.switchTo().alert();
			simple.accept();
		} else if (type.equalsIgnoreCase("Confirm alert")) {
			Alert confirm = driver.switchTo().alert();
			confirm.dismiss();
		} else if (type.equalsIgnoreCase("Prompt alert")) {
			Alert prompt = driver.switchTo().alert();
			prompt.dismiss();
		}

	}
	// actions

	public static void Actions(WebElement element, String type) {

		if (type.equalsIgnoreCase("double click")) {
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();

		} else if (type.equalsIgnoreCase("click")) {
			Actions action = new Actions(driver);
			action.click(element).perform();

		} else if (type.equalsIgnoreCase("right click")) {
			Actions action = new Actions(driver);
			action.contextClick(element).perform();

		}

	}

	public static void selectby(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}

	}

	public static void deselectby(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.deselectByIndex(index);
		} else if (type.equalsIgnoreCase("visible text")) {
			s.deselectByVisibleText(value);
		} else if (type.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}

	}

	public static void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
	}

	public static String Read_Particular_Data(String path, int row_index, int cell_index) throws Throwable {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_index);

		Cell cell = row.getCell(cell_index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();

			value = Double.toString(numericCellValue);

		}
		return value;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
