package com.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AddtoCartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class HomePageTest extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		browserinitialization();
		loginPage = new LoginPage();
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));

	}

	@Test
	public void chooseproduct() {
		productPage = homePage.chooseproduct();
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
