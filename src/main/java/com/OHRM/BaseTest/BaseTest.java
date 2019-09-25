
package com.OHRM.BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	public WebDriver driver;
	public String url="http://localhost:8081/orangehrm/symfony/web/index.php/auth/login";
	public String userName="Admin";
	public String password="Admin";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		 driver.close();
	}
	public void takeScreenshot(String testName) throws IOException
	{
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot, new File("F:/eclipse/OrangeHRM/Screenshots/"+testName+".jpeg"));
	}
}
