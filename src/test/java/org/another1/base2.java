package org.another1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base2 {
	public static WebDriver driver;
	public static Actions a;
	public static Alert b;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static void chromebrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	public static void launchurl(String url) {
		driver.get(url);
	}
	

	public static String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
        return currentUrl;
	}
	public static void maxwindow() {
		driver.manage().window().maximize();

	}
	public static void getdate() {
		Date d = new Date();
        System.out.println(d);
	}
	public static void filltext(WebElement element,String value) {
		element.sendKeys(value);
}
   public static void btnclick(WebElement ele) {
ele.click();
}
   //actions
public static void movetoele(WebElement element) {
	a=new Actions(driver);
	a.moveToElement(element);
}
public static void draganddrop(WebElement src,WebElement des) {
	a.dragAndDrop(src, des).perform();

}   
public static void doubleclick(WebElement click) {
	a.doubleClick().perform();
	}
 public static void contextclick(WebElement conclick) {
	a.contextClick();
	}  
   public static void paste() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}
   //alert
  public static void gettext() {
	Alert b = driver.switchTo().alert();
	String text = b.getText();
	System.out.println(text);
} 
  
  public static void dimiss() {
	b.dismiss();

}
   
   public static void accept() {
	b.accept();
}
   
   //javascriptexecutor
   
   public static void sendkey(WebElement element,String value) {
	js=(JavascriptExecutor) driver;
	js.executeScript(value,element);

}
   public static void click(WebElement element,String value) {
	js.executeScript(value, element);
}
   
   public static void getattribute(WebElement element,String value) {
	Object attribute = js.executeScript(value, element);
	System.out.println(attribute);
}
  //screenshot
   public static void screenshot(String value) throws IOException {
	ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File(value);
	FileUtils.copyFile(src, des);
}
  //windows handling
   public static void getwindowhandle() {
String parentid = driver.getWindowHandle();
System.out.println(parentid);
}
   public static void gethandleswindows() {
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
}
  public static void selectbyvalue(WebElement value,String value1) {
	Select selectvalue = new Select(value);
	selectvalue.selectByValue(value1);
} 
   public static void selectbyvisibletext(WebElement value,String value1) {
	Select selecttext = new Select(value);
	selecttext.selectByVisibleText(value1);
}
   public static void selectbyindex(WebElement value,int value1) {
	Select selectindex = new Select(value);
	selectindex.selectByIndex(value1);
}
  public static void getoption() {
	Select selectoption = new Select(driver.findElement(By.id("search")));
	List<WebElement> elementcount = selectoption.getOptions();
    System.out.println(elementcount.size());
} 
 public static  void deselectbyvalue(WebElement value,String value1) {
	 Select selectvalue = new Select(value);
	 selectvalue.deselectByValue(value1);
	}  
public static void deselectbyvisibletxt(WebElement value,String value1) {
	Select selecttxt = new Select(value);
	selecttxt.deselectByVisibleText(value1);
}
 public static void deselectbyindex(WebElement value,int value1) {
	Select selectindex = new Select(value);
	selectindex.deselectByIndex(value1);
}  
 public static void scrollupanddown(WebElement element,String value) {
	js.executeScript(value, element);
}  
   public static void ismultiply(WebElement ismultiple) {
	Select s = new Select(ismultiple);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
}
   public static void getfirstselect(WebElement element) {
	Select s = new Select(element);
	WebElement getfse = s.getFirstSelectedOption();
	System.out.println(getfse.getText());
   }
  public static void deselectall(WebElement element) {
	  Select s = new Select(element);
     s.deselectAll();
} 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
