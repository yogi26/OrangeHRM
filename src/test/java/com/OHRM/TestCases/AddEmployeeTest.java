package com.OHRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OHRM.BaseTest.BaseTest;
import com.OHRM.PageObjects.AddEmployeePage;
import com.OHRM.PageObjects.DashBoardPage;
import com.OHRM.PageObjects.ViewPersonalDetaillsPage;
import com.OHRM.PageObjects.LoginPage;

public class AddEmployeeTest extends BaseTest
{
	public LoginPage login;
	public AddEmployeePage employee;
	public ViewPersonalDetaillsPage empList;
	public DashBoardPage dashboard;
	
	@Test(priority=2)
	public void addEmployeeTest() throws IOException
	{
		login=new LoginPage(driver);
		dashboard=new DashBoardPage(driver);
		
		login.loginToOrangeHRM("Admin", "Admin");
		employee=dashboard.hoverAndClickOnPimMenu();
		employee.setFirstName("poi");
		employee.setMiddleName("uyt");
		employee.setLastName("rew");
		employee.setEmployeeId("");
		empList=employee.clickOnSave();
		boolean flag=empList.getProfileName().contains("poi");
		if(flag)
		{
			Assert.assertTrue(flag);
		}
		else
		{
			takeScreenshot("addEmployeeTest");
			Assert.assertTrue(flag, "Failed to new employee");
		}
		
		
	}
}
