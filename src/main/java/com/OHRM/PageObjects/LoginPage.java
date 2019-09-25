package com.OHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	@FindBy(id="spanMessage")
	WebElement spanMessage;
	
	
	//Actions Methods
	
	public void setUserName(String unm)
	{
		txtUsername.sendKeys(unm);
	}
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		btnLogin.click();
	}
	public void loginToOrangeHRM(String unm, String pass)
	{
		setUserName(unm);
		setPassword(pass);
		clickOnLogin();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public String getSpanMessage()
	{
		return spanMessage.getText();
	}
}
