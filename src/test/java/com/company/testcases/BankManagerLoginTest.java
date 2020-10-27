package com.company.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException{
		
		driver.findElement(By.cssSelector(or.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("addCustBtn_CSS"))),"Login not succesfull");
		
		System.out.println("login succesful");
}
}

