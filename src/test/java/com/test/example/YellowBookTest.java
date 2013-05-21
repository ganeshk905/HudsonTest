package com.test.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YellowBookTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test
	public  void testYell() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		//driver.getTitle();
       Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("srinivasan.velusamy@photoninfotech.net.photon");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Me@ph0t0n");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='home_Tab']/a")));
		driver.quit();
	
	}

}
