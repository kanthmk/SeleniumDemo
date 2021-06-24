package com.testcases;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AddtoCartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class ProductTest extends BaseClass{
	
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	AddtoCartPage addtoCartPage;
	
	public ProductTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		browserinitialization();
		loginPage = new LoginPage();
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		productPage = new ProductPage();
		productPage = homePage.chooseproduct();
	}

	@Test
	public void addproducttocart() {
		addtoCartPage = productPage.addtheproducttocart();
	}
		
	@AfterMethod
	public void close() {
		driver.close();
	}

}
