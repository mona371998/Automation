package base;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

//import com.Base.PageBase;

public class PageBase {
	
	private static Logger log = LoggerFactory.getLogger(PageBase.class);

	private WebDriverWait wait;
	private WebDriver driver;
	private JavascriptExecutor js;
	public static final long MAX_TIMEOUT = 90000;

	public PageBase(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,MAX_TIMEOUT);
		this.js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
}
	
	protected void clickingElementJS(WebElement element) {
		getWebElement(element);
		js.executeScript("arguments[0].click();", element);
	}
	
	protected void clickingElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (ElementNotInteractableException e) {
			clickingElementJS(element);
		}
	}

	protected WebElement getWebElement(WebElement element) {
		try {
			return wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			return wait.until(ExpectedConditions.visibilityOf(element));
		} catch (NoSuchElementException e) {
			log.error("Please check the locator you've entered--> ", element.toString());
			log.error("Element not found please check the locator", e);
			 Assert.fail(); 
		} catch (StaleElementReferenceException e) {
			return new WebDriverWait(driver,MAX_TIMEOUT)
					.until(ExpectedConditions.visibilityOf(element));
		}
		return element;
	}
	
	protected void NavigatetoPage(String pageURL) {
		driver.navigate().to(pageURL);
	}
	
	protected void setText(WebElement textBoxLabel, String inputText) {
		//clickingElement(textBoxLabel);
		getWebElement(textBoxLabel).clear();
		getWebElement(textBoxLabel).sendKeys(inputText);
	}
	
	
	
	protected String getText(WebElement element) {
		return getWebElement(element).getText();
	}
	
	protected Boolean isElementInvisible(WebElement element) {

		return wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	protected boolean isWebElementEnabled(WebElement element) {
		return getWebElement(element).isEnabled();
}

}
