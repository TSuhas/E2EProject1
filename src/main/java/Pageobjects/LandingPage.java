package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class LandingPage {

	
	public WebDriver driver;
	
	By login= By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");
	
	By result= By.xpath("//h2[text()='Featured Courses']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}



	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	public WebElement getresult()
	{
		return driver.findElement(result);
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
