package initpackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariOptions;

import com_constants.WebdriverConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionsManager {
	
	private ChromeOptions option;
	private FirefoxOptions optionFF;
	private SafariOptions optionSafari;
	private InternetExplorerOptions optionie;

	public ChromeOptions getChromeOptions() {
		option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("start-maximized");
		option.addArguments("enable-automation");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// WebdriverConstants.CHROMEDRIVER_PATH);
		return option;
	}
	
	
	  public ChromeOptions getChromeOptionsSpanish() { option = new
	  ChromeOptions(); Map<String, Object> prefs = new HashMap<String, Object>();
	  Map<String, Object> profile = new HashMap<String, Object>(); Map<String,
	  Object> contentSettings = new HashMap<String, Object>();
	  
	  contentSettings.put("geolocation", 1);
	  profile.put("managed_default_content_settings", contentSettings);
	  prefs.put("profile", profile); option.setExperimentalOption("prefs", prefs);
	  option.addArguments("--lang=es"); option.addArguments("--incognito");
	  option.addArguments("--disable-notifications");
	  option.addArguments("--disable-popup-blocking");
	  option.addArguments("start-maximized");
	  option.addArguments("enable-automation");
	  option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
	  UnexpectedAlertBehaviour.ACCEPT);
	  option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	  option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
	  WebDriverManager.chromedriver().setup(); //
	  System.setProperty("webdriver.chrome.driver", //
	  WebdriverConstants.CHROMEDRIVER_PATH); return option; }
	 
	
	public ChromeOptions getChromeOptionsChinese() {
		option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--lang=zh");
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("start-maximized");
		option.addArguments("enable-automation");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// WebdriverConstants.CHROMEDRIVER_PATH);
		return option;
	}
	
	public ChromeOptions getChromeOptionsHaitian() {
		option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--lang=ht");
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("start-maximized");
		option.addArguments("enable-automation");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// WebdriverConstants.CHROMEDRIVER_PATH);
		return option;
	}
	
	public ChromeOptions getChromeOptionsKorean() {
		option = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--lang=kr");
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("start-maximized");
		option.addArguments("enable-automation");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// WebdriverConstants.CHROMEDRIVER_PATH);
		return option;
	}

	public ChromeOptions getChromeHeadlessOptions() {
		option = new ChromeOptions();
		option.addArguments("--headless");
		option.addArguments("--incognito");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		System.setProperty("webdriver.chrome.driver", WebdriverConstants.CHROMEDRIVER_PATH);
		return option;
	}

	public ChromeOptions getChromeGridOptions() {
		option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("lang=en_GB");
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		option.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		option.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		option.setCapability("screenResolution", "1280x720");
		option.setCapability("tz", "Asia/Kolkata");
		option.setCapability("idleTimeout", 150);
		option.setCapability("recordVideo", false);
		return option;
	}

	public FirefoxOptions getFireFoxOptions() {
		optionFF = new FirefoxOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		// optionFF.setExperimentalOption("prefs", prefs);
		optionFF.addArguments("-private");
		optionFF.addArguments("-disable-notifications");
		optionFF.addArguments("-disable-popup-blocking");
		optionFF.addArguments("-start-maximized");
		optionFF.addArguments("-enable-automation");
		optionFF.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		optionFF.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		optionFF.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.gecko.driver",
		// WebdriverConstants.FIREFOXDRIVER_PATH);
		return optionFF;
	}

	public SafariOptions getSafariOptions() {
		optionSafari = new SafariOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		// optionFF.setExperimentalOption("prefs", prefs);
		optionSafari.setCapability("safari.cleanSession", true);
		optionSafari.merge(optionSafari);
		optionSafari.setCapability("browserstack.safari.enablePopups", "true");
		// optionFF.addArguments("-start-maximized");
		// optionFF.addArguments("-enable-automation");
		// optionFF.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
		// UnexpectedAlertBehaviour.ACCEPT);
		// optionFF.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		optionSafari.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		// WebDriverManager.safaridriver().setup();
		// System.setProperty("webdriver.gecko.driver",
		// WebdriverConstants.FIREFOXDRIVER_PATH);
		return optionSafari;
	}

	public InternetExplorerOptions getIeOptions() {
		optionie = new InternetExplorerOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> contentSettings = new HashMap<String, Object>();

		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		// optionFF.setExperimentalOption("prefs",prefs);
		// optionie.setCapability("safari.cleanSession", true);
		
		  //optionie.merge(optionSafari);
		  //optionie.setCapability("browserstack.safari.enablePopups", "true");
		  //optionie.addArguments("-start-maximized");
		  //optionFF.addArguments("-enable-automation");
		optionie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		  optionie.setCapability("ignoreZoomSetting", true);
		  optionie.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
		  UnexpectedAlertBehaviour.ACCEPT);
		  optionie.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		  optionie.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		 
		
		WebDriverManager.iedriver().setup();
		// System.setProperty("webdriver.gecko.driver",
		// WebdriverConstants.FIREFOXDRIVER_PATH);
		return optionie;
	}



}
