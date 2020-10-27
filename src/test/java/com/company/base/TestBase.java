package com.company.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.company.utilities.ExcelReader;

public class TestBase {

	
	/* Initializing everything namely
	 * WebDriver-done
	 * Properties-done
	 * Logs-log4j.jars, .logs , log4j.properties file
	 * ExtentReports
	 * DB
	 * Excel
	 * Mail
	 * ReportNG,ExtentReports
	 * Jenkins
	 * 
	 * 
	 */
	
	
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static Properties or=new Properties();
	public static FileInputStream fis;
	public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\Testdata.xlsx");
	
	
	
	@BeforeSuite	
	public void setUp() throws IOException {
		
		if(driver==null) {
			
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			or.load(fis);
		}
		
		if (config.getProperty("browser").equals("internetExplorer")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			
		}
		else if(config.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.get(config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")),TimeUnit.SECONDS);
		
	}
	
	public boolean isElementPresent(By by) {
		try {
			
			driver.findElement(by);
			return true;
		}
		catch (NoSuchElementException e){
			return false ;
		}
		
	}
	
	@AfterSuite			
	public void teardown() {
		
		if(driver!=null) {
			driver.quit();
		}
	
	}
}
