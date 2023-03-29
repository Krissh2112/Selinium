package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;


public class AmazonPojo extends BaseClass {
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='First and last name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	private WebElement phnNumber;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	public WebElement getName() {
		return name;
	}

	public WebElement getPhnNumber() {
		return phnNumber;
	}

	public WebElement getPassword() {
		return password;
	}

}
