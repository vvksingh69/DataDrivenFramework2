package com.company.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.company.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException{
		
		driver.findElement(By.cssSelector(or.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("addCustBtn_CSS"))),"Login not succesfull");
		
		System.out.println("login succesful");
		
//		Reporter.log("login is succesful");
//		Reporter.log("<a target=\"blank\" href=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\">Screenshot</a>");
//		Reporter.log("<br>");
//		Reporter.log("<a target=\"blank\" href=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\"><img src=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\" height=200 width=200></img></a>");

		
		
		// To open the screenshot in a different tab  we need to add following html code  target="blank"
		// To give a thunbnail within the reports of screenshot we need to add another image to the body img src="image link" size ratio
}
}

