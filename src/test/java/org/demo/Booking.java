package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {
	
	WebDriver driver;
	
	public void websiteNavigation() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    System.out.println("User Navigated to : " + driver.getCurrentUrl());
	}
	
	public void userDetails(){
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("QA Automation");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYZ@yopmail.com");
	System.out.println("User Details has been Updated");
	}

	public static void main(String[] args) {
		Booking b = new Booking();
		b.websiteNavigation();
		b.userDetails();
		
	}

}
