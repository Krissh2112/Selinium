package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class Emailpoja extends BaseClass {
	public Emailpoja() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")
	private WebElement Nextbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextbtn() {
		return Nextbtn;
	}
	
	

	

	
	}

	

	
	

