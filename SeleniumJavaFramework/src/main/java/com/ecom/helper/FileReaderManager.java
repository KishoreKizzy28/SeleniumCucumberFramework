package com.ecom.helper;

public class FileReaderManager {
	

	public static FileReaderManager getInstanceFrm() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getInstanceCR()  {
		ConfigurationReader reader = new ConfigurationReader(); 
		return reader;
	}
	
	
private FileReaderManager() {
		//restrict to create object in another class
	}

}
