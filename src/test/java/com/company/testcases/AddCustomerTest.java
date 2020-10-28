package com.company.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.company.base.TestBase;

public class AddCustomerTest extends TestBase{
	
	@Test(dataProvider="getData")
	public void addCustomer(String FirstName,String LastName,String postCode) throws InterruptedException {
		
		driver.findElement(By.cssSelector(or.getProperty("addCustBtn_CSS"))).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("firstName_CSS"))).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("lastName_CSS"))).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("postcode_CSS"))).sendKeys(postCode);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("addBtn_CSS"))).click();
		
		Assert.fail();
	}
	
	@DataProvider
	public Object [] [] getData() {
		
		String sheetName="AddCustomerTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
			
		
		Object [][] data =new Object[rows-1][cols];
		
		for (int rowNum=2; rowNum<=rows; rowNum++) {
			
			for (int colNum =0; colNum<cols; colNum++)
			{
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
			
		}
		
		
		return data;
		
		
		
		
	}

}
