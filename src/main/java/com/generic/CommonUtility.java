package com.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zoopla.basepage.Basepage;

public class CommonUtility extends Basepage{
	
	//Action Click
	public static void getActionClick(WebElement elm) {		
		Actions obj = new Actions(driver);
		obj.click(elm ).build().perform();
		
	}	
	
	public static void getMyResult(String ExpectedResult, String Actual) {
	Assert.assertEquals(ExpectedResult, Actual);	
	if(ExpectedResult.equals(Actual)) {
		System.out.println("expected and actual are equal");
	
	} else {                                                     
		System.out.println("expected and actual are not equal");
	
	}
	
	//JSClick(javascript executer click)	
	//public static void jsClick(WebElement elm) {
//((JavascriptExecutor) driver).executeScript("arguments[0].click();",elm);
		
	}
	}
   

	
