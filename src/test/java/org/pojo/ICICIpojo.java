package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class ICICIpojo extends BaseClass{
	public ICICIpojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[@id='login-btn']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement userId;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement passwrd;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginkey;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getUserId() {
		return userId;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getLoginkey() {
		return loginkey;
	}
	
	

}
