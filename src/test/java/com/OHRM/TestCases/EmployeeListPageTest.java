package com.OHRM.TestCases;

import org.testng.annotations.Test;

import com.OHRM.BaseTest.BaseTest;
import com.OHRM.PageObjects.DashBoardPage;
import com.OHRM.PageObjects.EmployeeListPage;
import com.OHRM.PageObjects.LoginPage;

public class EmployeeListPageTest extends BaseTest
{
	public LoginPage login;
	public EmployeeListPage empList;
	public DashBoardPage dashboard;
	@Test(priority=1)
	public void searchEmployeeTest() throws InterruptedException
	{
		login=new LoginPage(driver);
		login.loginToOrangeHRM("Admin", "Admin");
		dashboard=new DashBoardPage(driver);
		empList=dashboard.hoverAndClickOnEmployeeListMenu();
		empList.setEmpSearchText("Yogesh W Giri");
		empList.clickOnSearchBtn();
		Thread.sleep(5000);
		
	}
}
