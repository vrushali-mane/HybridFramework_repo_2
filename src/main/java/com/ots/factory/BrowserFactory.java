package com.ots.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.ots.dataProvider.ConfigReader;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
 
	public static WebDriver startBrowser(String browserName, String url)
	{
	
		if(browserName.contains("Chrome") || browserName.contains("Ch"))
		{
			ChromeOptions opt=new ChromeOptions();
			driver=new ChromeDriver(opt);
		}
		else 
		{
			System.out.println("We don't support"+browserName+"Please proide Chrome browser");
		}
		
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("pageLoadTimeOut"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("scriptTimeOut"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait"))));
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
