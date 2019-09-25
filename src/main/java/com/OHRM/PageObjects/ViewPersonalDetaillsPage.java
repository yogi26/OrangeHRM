package com.OHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPersonalDetaillsPage
{
	public WebDriver driver;
	public ViewPersonalDetaillsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='profile-pic']/h1")
	WebElement profile;
	
	public String getProfileName()
	{
		return profile.getText();
	}
}
