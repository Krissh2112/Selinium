package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class Mynthrapojo extends BaseClass {
	public Mynthrapojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[@draggable='false'])[55]")
	private WebElement item;
	
	@FindBy(xpath="(//img[@draggable='false'])[4]")
	private WebElement Product;
	
	@FindBy(xpath="//span[contains(text(),'GO TO BAG')]")
	private WebElement addKart;

	public WebElement getItem() {
		return item;
	}

	public WebElement getProduct() {
		return Product;
	}

	public WebElement getAddKart() {
		return addKart;
	}

	

	

}
