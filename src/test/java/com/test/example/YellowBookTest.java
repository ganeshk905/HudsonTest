package com.test.example;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YellowBookTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test
	public  void testYell() throws InterruptedException {
		// TODO Auto-generated method stub

		URL server = new URL("http://127.0.0.1:4444/wd/hub");
		 
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName("firefox");
	 
	    System.out.println("Connecting to " + server);
	 
	    WebDriver driver = new RemoteWebDriver(server, capabilities);
	 
	    driver.get("http://www.google.com");
	 
	    driver.quit();
	
	}

}