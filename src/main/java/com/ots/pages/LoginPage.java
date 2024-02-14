package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
	this.driver=driver;	
	}
	
	private By loginText=By.xpath("//h1[normalize-space()='Learn Automation Courses']");
	private By menuOpt=By.xpath("//img[@alt='menu']");
	private By loginBtn=By.xpath("//button[normalize-space()='Log in']");
	private By signUpLink=By.xpath("//a[normalize-space()='New user? Signup']");
	
	public String LoginPageVerification() {
		
		String url = null;
	if (driver.findElement(loginText).getText().equals("Learn Automation Courses"))
	{
		System.out.println("Click menu optn");
		driver.findElement(menuOpt).click();
		
		System.out.println("Click Login optn");
		driver.findElement(loginBtn).click();
		
		driver.findElement(signUpLink).click();
		
		url=driver.getCurrentUrl();
		
	}
	return url;		
		
	}
	

}
