import org.another1.base2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoamazon extends base2{

	 public pojoamazon() {
	PageFactory.initElements(driver, this);
}
	
@FindBy(id="nav-link-accountList-nav-line-1")
private WebElement signin;

@FindBy(id="ap_email")
private WebElement email;

@FindBy(id="ap_password\"")
private WebElement passwd;
 @FindBy(id="signInSubmit")
private WebElement sign;
public WebElement getSignin() {
	return signin;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPasswd() {
	return passwd;
}
public WebElement getSign() {
	return sign;
}
 
 
	
	
	
	
	
	
	
	
}
