package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"item_3_img_link\"]/img")
	WebElement item;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//Choosing product
	public ProductPage chooseproduct()
	{
		actions = new Actions(driver);
		actions.moveToElement(item);
		item.click();
		return new ProductPage();
	}
	

}
