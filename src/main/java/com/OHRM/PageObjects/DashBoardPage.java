package com.OHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage 
{
	public WebDriver driver;
	Actions action;
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Page Elements
	@FindBy(xpath="//*[@id='content']/div/div[1]/h1")
	WebElement dashBoardPanel;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimModule;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployeeMenu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement employeeListMenu;
	
	//Actions Methods
	public AddEmployeePage hoverAndClickOnPimMenu()
	{
		action=new Actions(driver);
		action.moveToElement(pimModule).perform();
		addEmployeeMenu.click();
		
		return new AddEmployeePage(driver);
	}
	public EmployeeListPage hoverAndClickOnEmployeeListMenu()
	{
		action=new Actions(driver);
		action.moveToElement(pimModule).perform();
		employeeListMenu.click();
		
		return new EmployeeListPage(driver);
	}
	public boolean isHomepageDisplayed()
	{
		boolean flag=dashBoardPanel.getText().equals("Dashboard");
		return flag;
	}
	
}
