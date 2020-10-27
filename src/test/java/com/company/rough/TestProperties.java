package com.company.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		Properties config=new Properties();
		Properties or=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		or.load(fis);
		
		
		System.out.println(config.get("browser"));
		System.out.println(or.getProperty("bmlBtn"));
	}

}
