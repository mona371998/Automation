package initpackage;

import org.openqa.selenium.WebDriver;

//import com_init.BrowserFactory;
//import com_init.SessionInit;

public class SessionInit {
	
	private static SessionInit session = null;

	private SessionInit() {
	}

	/**
	 * initiate the sessionInit class
	 * @return instance of sessionInit class
	 */
	public static SessionInit getDriverSession() {
		if (session == null) {
			session = new SessionInit();
		}
		return session;
	}

	/**
	 * initiate the web browser session
	 * 
	 * @param browser initiate the web browser session
	 */
	public void initiateBrowserSession(String browser) {
		BrowserFactory.setBrowser(browser);
	}

	/**
	 * get browser session
	 * 
	 * @return webdriver of browser instance
	 */
	public WebDriver getBrowserSession() {
		return BrowserFactory.getBrowser();
	}

	/**
	 * terminates the web browser session
	 */
	public void terminateBrowserSession(WebDriver driver) {
		if (session != null) {
			BrowserFactory.closeBrowser(driver);
			session = null;
		}
	}


}
