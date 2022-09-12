package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestData.LoginTestData;
import base.BaseClass;
import pageclass.LoginPage;




public class TestClass extends BaseClass{
	 LoginPage dp;
	
	
	static JavascriptExecutor js;
	
    public void TC_login() throws InterruptedException {
 
		driver.get(LoginTestData.baseURL);
		
		
	    LoginPage lp=new LoginPage(driver);
		 

		   
    
    }
  
    
    @Parameters({ "browser" })
    @Test(enabled=true,description ="check all links") 
    public void link_1(String browser) throws Exception {
    	
//    	 TC_login();
    	 
  		dp = new LoginPage(getDriver());
			  dp.getLoginPage(LoginTestData.baseURL)
			     .setUsername(LoginTestData.Username)
			     .setPassword(LoginTestData.Password)
			     .SignBtn();
		Thread.sleep(3000);
			
		String screenshotName= getTitle()+unixTimeStamp();
            takeScreenshot(screenshotName);
		
  						  
}
}
