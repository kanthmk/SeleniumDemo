package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ProductPage extends BaseClass {

	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement addtocart;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement carticon;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddtoCartPage addtheproducttocart()
	{
		addtocart.click();
		carticon.click();
	    return new AddtoCartPage();
	}
}
