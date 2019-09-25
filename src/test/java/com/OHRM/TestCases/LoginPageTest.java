package com.OHRM.TestCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OHRM.BaseTest.BaseTest;
import com.OHRM.PageObjects.DashBoardPage;
import com.OHRM.PageObjects.LoginPage;

public class LoginPageTest extends BaseTest
{
	public LoginPage login;
	public DashBoardPage dashboard;
	@Test
	public void loginTest() throws IOException
	{
		login=new LoginPage(driver);
		login.loginToOrangeHRM(userName, password);
		try
		{
			dashboard=new DashBoardPage(driver);
			if(dashboard.isHomepageDisplayed())
			{
				assert(true);
			}
		}
		catch(NoSuchElementException e)
		{
			if(login.getSpanMessage().equals("Invalid credentials"))
			{
				takeScreenshot("loginTest");
				Assert.assertTrue(false, "Invalid credentials");
				
			}
		}
	}
	
	
}
