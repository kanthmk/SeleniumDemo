package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	
	Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(id ="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@name='login-button']")
	WebElement login_button;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public HomePage Login(String un,String pwd)
	{
		log.info("Entering username and password");
		log.error("error message");
		log.debug("debug message");
		log.warn("warn message");
		log.fatal("fatal message");
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
		return new HomePage();
	}

}
