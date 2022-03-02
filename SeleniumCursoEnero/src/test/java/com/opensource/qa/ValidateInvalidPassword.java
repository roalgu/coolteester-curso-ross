package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ValidateInvalidPassword {

	String username, password;

	@BeforeTest
	public void beforeTest() {

		// Test Data
		username = "xyz";
		password = "xyx999";
			
	}

	@AfterTest
	public void afterTest() {
	}

	@Test
	public void tc006ValidateInvalidPassword() {
		// Step1
		Reporter.log("Lounch browser");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		// Step 2
		Reporter.log("Enter Username, Password incorrect");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		//Step3
		Reporter.log("Click Login");
		driver.findElement(By.id("btnLogin")).click();
		
		// Step 4
		Reporter.log("Verify error message when enter invalid password");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spanMessage")));
		
	}
}