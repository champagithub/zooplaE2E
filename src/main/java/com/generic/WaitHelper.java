package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.basepage.Basepage;

public class WaitHelper extends Basepage{
	
	public static void ExplicitWaitStatement(WebElement Waiter) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Waiter));
	}

}
