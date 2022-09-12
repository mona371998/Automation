package initpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com_constants.WebdriverConstants;
//import com_init.OptionsManager;

public class BrowserFactory {
	
	private static ThreadLocal<WebDriver> browser = new ThreadLocal<WebDriver>();
	private static OptionsManager op;

	/**
	 * get the web browser instance
	 * 
	 * @return browser invokes the instance of the webbrowser
	 */
	public static WebDriver getBrowser() {
		return browser.get();
	}

	/**
	 * set the web browser instance
	 * 
	 * @param browser sets the instance of the webbrowser
	 */
	public static void setBrowser(String browserDriver) {

		op = new OptionsManager();

		switch (browserDriver) {

		case "chrome-eng":
			browser.set(new ChromeDriver(op.getChromeOptions()));
			break;
			
		 case "chrome-spanish":
			browser.set(new ChromeDriver(op.getChromeOptionsSpanish()));
			break;
			
		case "chrome-chinese":
			browser.set(new ChromeDriver(op.getChromeOptionsChinese()));
			break;
       
		case "chrome-haitian":
			browser.set(new ChromeDriver(op.getChromeOptionsHaitian()));
			break; 
			
		case "chrome-korean":
			browser.set(new ChromeDriver(op.getChromeOptionsKorean()));
			break;
			
		case "chrome-headless":
			browser.set(new ChromeDriver(op.getChromeHeadlessOptions()));
			break;

		  case "chrome-grid": try { 
			  browser.set(new RemoteWebDriver(new
		  URL(WebdriverConstants.GRID_URL), op.getChromeGridOptions())); 
		  } 
		  catch(MalformedURLException e) { 
			  e.printStackTrace(); 
			  } 
		  break;

			case "firefox":
				browser.set(new FirefoxDriver(op.getFireFoxOptions()));
				break;
				
			case "safari":
				browser.set(new SafariDriver(op.getSafariOptions()));
				break;
				
				
			case "ie":
				browser.set(new InternetExplorerDriver(op.getIeOptions()));
				break;

		default:
			browser.set(new ChromeDriver(op.getChromeOptions()));
			break;
		}
	}
	
	
	
	/**
	 * close the web browser
	 * 
	 * @param driver webdriver instance
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
		browser.remove();
	}


}
