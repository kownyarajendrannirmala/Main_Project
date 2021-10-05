package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	
	
	public static Properties p;

	public Config_Reader() throws Throwable {
		File f = new File
				("C:\\Users\\Kownya\\eclipse-workspace\\project\\src\\main\\java\\Property_File\\Configuration.properties");
				
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("db_Username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("db_Password");
		return password;
	}
	
	
	
	
	
}


