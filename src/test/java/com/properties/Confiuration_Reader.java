package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Confiuration_Reader {
	public static Properties p;
	public Confiuration_Reader() throws IOException {
		File f=new File("C:\\Users\\prem\\eclipse-workspace\\Cucumber_Apm\\src\\test\\java\\com\\properties\\Configuration.properties");
		FileInputStream stream=new FileInputStream(f);
		Properties p= new Properties();
		p.load(stream);
		
		
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getuservalue() {
		String user = p.getProperty("username");
		return user;
	}
	
	public String getpasswordvalue() {
		String passwor = p.getProperty("password");
		return passwor;
	}
}
