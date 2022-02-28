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

public class CreateUser {

	String username, password, newuser, newEmployee, password2,msgNoRecords;

	@BeforeTest
	public void beforeTest() {

		// Test Data
		username = "Admin";
		password = "admin123";
		newEmployee= "Admin A";
		newuser = "Septiembre";
		password2="Pato.123";
		msgNoRecords="No Records Found";
		
	}

	@AfterTest
	public void afterTest() {
	}

	@Test
	public void tc003AdminCreateUser() {
		// Step1
		Reporter.log("Open Browser  \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		// Step2
		Reporter.log("Enter Usernam, Password and click Login");
		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 5
		Reporter.log("Click Add button");
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys(newEmployee);
		
		//Step7
		Reporter.log("Enter valid username");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(newuser);
				
		//Step8
		Reporter.log("Enter new password");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys(password2);
		
		//Step8.1
		Reporter.log("Confirm password");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys(password2);
		
		//Step9
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
				
		//Step10
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys(newuser);
		
		
		//Step11
		Reporter.log("Click search");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step12
		Reporter.log("Verify username exist in table");
		
		//AssertEquals
		String actualValue =  driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecords);
		
			
		// Step 13
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 14
		Reporter.log("Close Browser");
		driver.close();
	}
}

