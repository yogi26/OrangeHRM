package com.OHRM.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage
{
	public WebDriver driver;
	public EmployeeListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Page Objects
	@FindBy(id="empsearch_employee_name_empName")
	WebElement empSearchText;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	@FindBy(name="btnAdd")
	WebElement btnAdd;
	
	@FindBy(name="btnDelete")
	WebElement btnDelete;
	
	//Actions Methods
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void setEmpSearchText(String searchName)
	{
		empSearchText.sendKeys(searchName);
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("document.getElementById('searchBtn').value='"+searchName+"';");
		//js.executeScript("argument[0].value='"+searchName+"';",empSearchText);
	}
	public void clickOnSearchBtn()
	{
		searchBtn.click();
	}
	public void clickOnDeleteBtn()
	{
		btnDelete.click();
	}
	public void clickOnBtnAdd()
	{
		btnAdd.click();
	}
}
