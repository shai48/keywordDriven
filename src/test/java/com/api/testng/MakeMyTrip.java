package com.api.testng;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTrip {
public static	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@Test
	public void trainBooking() {
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains active']")).click();
		
		}
	@After
	public void tearDown() {
		driver.close();
	}

}
