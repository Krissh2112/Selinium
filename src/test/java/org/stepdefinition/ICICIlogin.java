package org.stepdefinition;

import org.pojo.ICICIpojo;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICICIlogin extends BaseClass{
	ICICIpojo I;
	@Given("To launch The Browser")
	public void to_launch_The_Browser() {
	   launchBrowser();
	}

	@When("To launch url of ICICI application")
	public void to_launch_url_of_ICICI_application() {
	   launchUrl("https://www.icicibank.com/"); 
	}

	//@When("To click the login button")
	//public void to_click_the_login_button() throws InterruptedException {
	//	Thread.sleep(3000);
	//    I.getLoginbtn().click();
	//}

	//@When("To enter UserID")
	//public void to_enter_UserID() {
	//    passText("krishna", I.getUserId());
	//}

	//@When("To enter password")
	//public void to_enter_password() {
	//    passText("6561156", I.getPasswrd());
	//}

	//@When("To click login button")
	//public void to_click_login_button() {
	//    clickBtn(I.getLoginkey());
	//}

	@Then("Close the browser")
	public void close_the_browser() {
	    closeEntireBrowser();
	}



}
