package pageclass;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import TestData.IdentityData;
import base.PageBase;


//import com.Base.PageBase;
//import com.Base.TestBase;

//import com_Page.LoginPage;
//import com_TestData.IdentityData;

public class LoginPage extends PageBase {
	
//  IdentityData data;
	
	WebDriver driver;

	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	

	@FindBy(xpath ="//*[@id=\"loginForm\"]/div/div/input")
	WebElement sign;
	

	
		/*
		 * @FindBy(
		 * css="#dropdown-toggle-12 > span.rds-icon.system-arrow-down.rds-icon-16 > span > svg > path"
		 * ) WebElement SelectLang;
		 * 
		 * @FindBy(css="ul.dropdown-options>li:nth-child(8)") WebElement
		 * SelectdropdownChinese;
		 */
	
	 public LoginPage(WebDriver driver) {
		
			super(driver);
			PageFactory.initElements(driver, this);
	}
	
	 public LoginPage getLoginPage(String pageURL) {
			NavigatetoPage(pageURL);
			return this;
		}
	
    public LoginPage setUsername(String uname) {
	      setText(username,uname); 
	      return this;
		}
	
	public LoginPage setPassword(String pwd) {
		System.out.println(pwd);
		setText(password,pwd); 
		  return this;
    	}
	   
	public LoginPage SignBtn() {
		clickingElement(sign);
		return this;
    }
	

	
	
	
	
		 
	     

}
