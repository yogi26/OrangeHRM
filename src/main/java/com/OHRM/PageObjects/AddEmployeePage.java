package com.OHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage 
{
	WebDriver driver;
	public AddEmployeePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Page Elements
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="employeeId")
	WebElement employeeId;
	
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/h1")
	WebElement addEmployeePanel;
	
	//Actions Methods
	public void setFirstName(String fnm)
	{
		firstName.sendKeys(fnm);
	}
	public void setMiddleName(String mnm)
	{
		middleName.sendKeys(mnm);
	}
	public void setLastName(String lnm)
	{
		lastName.sendKeys(lnm);
	}
	public void setEmployeeId(String eid)
	{
		employeeId.clear();
		employeeId.sendKeys(eid);
	}
	public ViewPersonalDetaillsPage clickOnSave()
	{
		btnSave.click();
		return new ViewPersonalDetaillsPage(driver);
		
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public String getAddEmployeePanelText()
	{
		return addEmployeePanel.getText();
	}
}
