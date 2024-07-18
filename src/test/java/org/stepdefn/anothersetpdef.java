package org.stepdefn;

import org.another1.base2;
import org.another1.pojofb;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class anothersetpdef extends base2 {


	@Given("To launch  chrome browser and launch fb url")
	public void to_launch_chrome_browser_and_launch_fb_url() {
	    chromebrowser();
	    launchurl("https://www.facebook.com/");
	    maxwindow();
	}

	@When("To enter valid email  {string}  in username field")
	public void to_enter_valid_email_in_username_field(String email) {
	    pojofb f=new pojofb();
	    WebElement txtemail = f.getTxtemail();
	    filltext(txtemail, email);
	    
	    
	}

	@When("To enter valid password {string} in password field")
	public void to_enter_valid_password_in_password_field(String pass) {
	    pojofb f = new pojofb();
	    WebElement txtpass = f.getTxtpass();
	    filltext(txtpass, pass);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    pojofb f = new pojofb();
	    WebElement btnlgn = f.getBtnlgn();
	    btnclick(btnlgn);
	}

	@Then("To close chrome browser")
	public void to_close_chrome_browser() {
	   
	}


	
	
}
