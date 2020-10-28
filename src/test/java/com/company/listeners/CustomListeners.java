package com.company.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
	
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("login is succesful");
		Reporter.log("<a target=\"blank\" href=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"blank\" href=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\"><img src=\"C:\\Users\\vivek.kumarsingh\\Desktop\\compile1.jpg\" height=200 width=200></img></a>");

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
