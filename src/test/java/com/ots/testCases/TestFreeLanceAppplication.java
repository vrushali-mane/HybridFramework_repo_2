package com.ots.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ots.base.BaseClass;
import com.ots.pages.LoginPage;

public class TestFreeLanceAppplication extends BaseClass {
	
	@Test
	
	public void verifyNewUser()
	{
		LoginPage page1=new LoginPage(driver);
		Assert.assertTrue(page1.LoginPageVerification().contains("signup"));
		System.out.println("Url contains signup");
	}

}
