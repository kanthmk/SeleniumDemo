/*
 * author MaheshKanth
 * 
*/
package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		browserinitialization();
		loginPage = new LoginPage();
	}

	@Test
	public void logintest() {
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
