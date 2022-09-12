package com_listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;

public class WebDriverListener implements WebDriverEventListener{
	
	private static final Logger log = LoggerFactory.getLogger(WebDriverListener.class);

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		
		log.info("Before accepting alert: " + driver.switchTo().alert().getText());
		Reporter.log("Before accepting alert: " + driver.switchTo().alert().getText() + "<br>");
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {

		log.info("Alert accepted: " + driver.switchTo().alert().getText());
		Reporter.log("Alert Accepted: " + driver.switchTo().alert().getText() + "<br>");

	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {

		log.info("After Alert Dismiss: " + driver.switchTo().alert().getText());
		Reporter.log("Alert Dismissed: " + driver.switchTo().alert().getText() + "<br>");

	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {

		log.info("Before alert Dismiss: " + driver.switchTo().alert().getText());
		Reporter.log("Before alert Dismiss: " + driver.switchTo().alert().getText() + "<br>");

	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {

		log.info("Navigating to: " + url);
		Reporter.log("Navigating to url: " + url + "<br>");

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {

		log.info("Navigated to this URL: " + url);
		Reporter.log("Navigated to url: " + url + "<br>");

	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {

		log.info("Navigating back from: " + driver.getCurrentUrl());
		Reporter.log("Navigating back from url: " + driver.getCurrentUrl() + "<br>");

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {

		log.info("Navigated back from: " + driver.getCurrentUrl());
		Reporter.log("Navigated back from url: " + driver.getCurrentUrl() + "<br>");

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {

		log.info("Navigating forward from: " + driver.getCurrentUrl());
		Reporter.log("Navigating forward from url: " + driver.getCurrentUrl() + "<br>");

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {

		log.info("Navigated forward from: " + driver.getCurrentUrl());
		Reporter.log("Navigated forward from url: " + driver.getCurrentUrl() + "<br>");

	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		log.info("Before Navigate Refresh: " + driver.getCurrentUrl());
		Reporter.log("Before Navigate Refresh: " + driver.getCurrentUrl() + "<br>");

	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {

		log.info("After Navigate Refresh: " + driver.getCurrentUrl());
		Reporter.log("After Navigate Refresh: " + driver.getCurrentUrl() + "<br>");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {

		if (arg1 == null) {
			Reporter.log("Finding Element by locator: " + arg0.toString() + "<br>");

		} else {
			Reporter.log("Finding Element by locator: " + arg0.toString() + "<br>");
		}
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {

		log.info("Element Found: " + element.toString());
		Reporter.log("Element Found: " + element.toString() + "<br>");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {

		log.info("Before Clicking on: " + element.toString());
		Reporter.log("Before Clicking on element: " + element.toString() + "<br>");

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		log.info("Clicked on: " + element.toString());
		Reporter.log("Clicked on element: " + element.toString() + "<br>");
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		log.info("Before Changing value of: " + element.toString());
		Reporter.log("Before Changing value of: " + element.toString() + "<br>");
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		log.info("After Changing value of: " + element.toString());
		Reporter.log("After Changing value of: " + element.toString() + "<br>");

	}

	@Override
	public void beforeScript(String script, WebDriver driver) {

		log.info("Before Script: " + script);
		Reporter.log("Before Script: " + script + "<br>");

	}

	@Override
	public void afterScript(String script, WebDriver driver) {

		log.info("After Script: " + script);
		Reporter.log("After Script: " + script + "<br>");

	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {

		log.info("Before Switch to window" + windowName);
		Reporter.log("Before Switch to window" + windowName + "<br>");

	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {

		log.info("After Switch to window: " + windowName);
		Reporter.log("After Switch to window: " + windowName + "<br>");

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {

		log.error("Exception thrown: " + throwable);
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		log.info("Before Taking Screenshot: " + target.toString());
		Reporter.log("Before Taking Screenshot: " + target.toString() + "<br>");

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

		log.info("After Taking Screenshot: " + target.toString());
		Reporter.log("After Taking Screenshot: " + target.toString() + "<br>");

	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {

		log.info("before getting text: " + element.getText());
		Reporter.log("before getting text: " + element.getText() + "<br>");

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {

		log.info("After getting text: " + element.getText());
		Reporter.log("After getting text: " + element.getText() + "<br>");

	}



}
