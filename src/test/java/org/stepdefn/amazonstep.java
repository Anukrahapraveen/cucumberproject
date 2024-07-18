package org.stepdefn;

import org.another1.base2;
import org.another1.pojoamazon;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonstep extends base2 {

	@Given("to launch the chrome browser and hit the amazon url")
	public void to_launch_the_chrome_browser_and_hit_the_amazon_url() {
	   chromebrowser();
	   launchurl("https://www.amazon.in/");
	   maxwindow();
	}

	@When("to enter the valid email in username field")
	public void to_enter_the_valid_email_in_username_field() {
	    pojoamazon p = new pojoamazon();
	    WebElement signin = p.getSignin();
	   btnclick(signin);
	    WebElement email = p.getEmail();
	    filltext(email, "abc@gmail.com");
	    
	    WebElement cont = p.getCont();
	    btnclick(cont);
	}

	@When("To enter invalid password in password field")
	public void to_enter_invalid_password_in_password_field() {
	  
	   pojoamazon p = new pojoamazon();
	   WebElement passwd = p.getPasswd();
	   filltext(passwd, "anukraha");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	    pojoamazon p = new pojoamazon();
	  WebElement sign = p.getSign();
	  btnclick(sign);
	}

	@Then("to close the browser")
	public void to_close_the_browser() {
	    
	}


}
