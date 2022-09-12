package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;


//import com_init.SessionInit;
import com_listener.WebDriverListener;
import initpackage.SessionInit;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass extends EnvBase {
	
	 public  WebDriver driver;
	 public String browserLang;
	 private EventFiringWebDriver eventHandler;
	 private WebDriverListener ecapture;
	 
	
	  @Parameters({ "browser" })
	  @BeforeMethod
	  public void setDriver(@Optional("chrome") String browser) {
			
			SessionInit.getDriverSession().initiateBrowserSession(browser);
			this.driver = SessionInit.getDriverSession().getBrowserSession();

			this.eventHandler = new EventFiringWebDriver(driver);
			this.ecapture = new WebDriverListener();
			this.eventHandler.register(ecapture);
		}
	  
	  public int getListOflinks() {
		  
		  List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		  return links.size();
	  }
		 
		 public void takeScreenshot(String filename) {
			 
			  Shutterbug.shootPage(driver, Capture.FULL,true).save();
			 //Shutterbug.shootPage(driver, Capture.FULL_SCROLL ,500,true).save();
		   	// Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
		    // Shutterbug.shootPage(driver).save();
		    // Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE,500,true).withName(filename).save();
		  
		  }
		 
	 public long unixTimeStamp() {
    	  
     	 Date now =new Date();
     	 Long longtime =new Long (now.getTime()/1000);
     	 return longtime.intValue();
      }
     public  void waitforPageLoad() {
    	
    	  WebDriverWait wait = new WebDriverWait(driver, 30);
		  
		  wait.until(new ExpectedCondition<Boolean>() { public Boolean apply(WebDriver
		  wdriver) { return ((JavascriptExecutor) driver).executeScript(
		  "return document.readyState" ).equals("complete"); } });  
     	
      } 
     public EventFiringWebDriver getDriver() {
  			return this.eventHandler;
  		}
     
      public String getTitle() {
    	  return driver.getTitle();
      }
      
    
      @AfterMethod
      
   
	
      public void teardown() {
    	driver.quit();
       }
  
	

  	public String getBrowser() {
  	
  		return browserLang;
  	}


}
