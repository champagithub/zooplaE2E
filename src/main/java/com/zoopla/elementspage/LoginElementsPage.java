package com.zoopla.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.basepage.Basepage;

public class LoginElementsPage extends Basepage {
	public LoginElementsPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a"))	//sign in Button	
@CacheLookup
private WebElement ClickonSignin;

public WebElement getClickonSignin() {
	return ClickonSignin;
}

@FindBy(xpath=("//*[@id='email']"))  //Username
@CacheLookup
private WebElement UserName;                           

 public WebElement getUserName() {                           //use getter setter or u can write
 return UserName;
 
 }


 @FindBy(xpath=("//*[@id='password']"))  //password
 @CacheLookup                                                    
private WebElement PassWord;
	public WebElement getPassWord() {
		return PassWord;
	}
	
@FindBy(xpath=("(//*[contains(@class,'c-klmMZv ')])[4]")) //login
 @CacheLookup
 private WebElement Login;
public WebElement getLogin() {
	return Login;
}

@FindBy(xpath=("//*[text()='Welcome back to your account']")) //mytext
@CacheLookup
private WebElement text;
public WebElement getMyText() {
	return text;
	
}
	
public void getMyUserNameAndPWD(String MyName,String MyPWD) { //to get my password and username or both
	getUserName().sendKeys(MyName);
	getPassWord().sendKeys(MyPWD);

 
	
}


}


