package com.zoopla.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.CommonUtility;
import com.zoopla.basepage.Basepage;
import com.zoopla.elementspage.LoginElementsPage;

import io.cucumber.java.en.*;
//import zoopla.uk.generic.WaitHelper;



public class LoginTest extends Basepage {
	 LoginElementsPage pf;
	
	@Given("User able to open any browsers.")
	public void user_able_to_open_any_browsers() {
		logger.info("User able to open any browsers.");
		Basepage.initializations();
		pf = new  LoginElementsPage();
		
	   
	}
	@Given("User able to enter {string} URL")
	public void user_able_to_enter_url(String URL) {
		logger.info("User able to enter {string} URL");
	    driver.get(URL);
	   
	}
	@When("User able to click  sign_in button")
	public void user_able_to_click_sign_in_button() {
		logger.info("User able to click  sign_in button");
	    pf.getClickonSignin().click();
	  
	}
	@When("User able to enter username")
	public void user_able_to_enter_username() {
		logger.info("User able to enter username");
	 //   pf.getUserName().sendKeys("champanandi11@yahoo.com");

	}
	@When("User able to enter password")
	public void user_able_to_enter_password() {
		logger.info("User able to enter password");
	 //   pf.getPassWord().sendKeys("smarttech");
		pf.getMyUserNameAndPWD(prop.getProperty("userName"),prop.getProperty("pwd"));
	   
	}
	@When("User able to click login button")
	public void user_able_to_click_login_button() {
	  logger.info("User able to click login button");
	  pf.getLogin().click(); 
	   
	}
	@Then("User able to validate the title page {string} on the UI and LogOut")
	public void user_able_to_validate_the_title_page_on_the_ui_and_log_out(String text) {
		logger.info("User able to validate the title page {string} on the UI and LogOut");
		CommonUtility.getMyResult(text, pf.getMyText().getText());   
	   
	}

	
}


