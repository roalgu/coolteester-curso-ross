package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookTest {
	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void googleTest() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse"); //Ejercicio 1
		String j = driver.getCurrentUrl(); //Ejercicio 2
		 System.out.println("Your page Is : "+j);
		//1- Text box para ingresar el correo electrónico.  //input[@name="email"]
		//2- Text box para ingresar la contraseña. //*[@id="passContainer"]
		//3- Botón iniciar sesión. //*[@id="loginbutton"]
		//4- Botón "¿Olvidaste tu contraseña?".  a[href^='https://www.facebook.com/recover/initiate/?ars=facebook_login']
		//5- Label "Crea una página para una celebridad, una marca o un negocio.".  
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net')]")));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
