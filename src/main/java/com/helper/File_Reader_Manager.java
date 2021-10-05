package com.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {

	}
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager reader = new File_Reader_Manager();
		return reader;
	}
	public static Config_Reader getInstanceCR( ) throws Throwable {
		Config_Reader reader = new Config_Reader();
		return reader;
		
	}

}


