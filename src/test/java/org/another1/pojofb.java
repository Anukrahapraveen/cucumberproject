package org.another1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojofb extends base2 {

	public pojofb() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlgn;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlgn() {
		return btnlgn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
