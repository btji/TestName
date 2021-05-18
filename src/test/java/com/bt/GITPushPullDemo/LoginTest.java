package com.bt.GITPushPullDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {  
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\executables\\chromedriver.exe");
		  driver=new ChromeDriver(); 
		  driver.get("http://www.gmail.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
	}
	
	@Test
	public void doLogin() {
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("lawlessbt");
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		/*
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mahima89"
		 * );
		 * driver.findElement(By.xpath("//div[@class='qhFLie']/div/div/button")).click()
		 * ;
		 */
	}

	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	  
}
