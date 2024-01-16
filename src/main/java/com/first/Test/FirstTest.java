package com.first.Test;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("github", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void TestYoutube() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		// driver.findElement(By.name("search_query")).sendKeys("testng", Keys.ENTER);
		driver.findElement(By.name("search_query")).sendKeys("Boo", Keys.SPACE, "Thang");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
