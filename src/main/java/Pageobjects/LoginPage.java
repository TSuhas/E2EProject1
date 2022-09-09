package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");
	By password= By.xpath("//input[@id='user_password']");
	By clickLogin = By.xpath("//input[@class='btn btn-primary btn-md login-button']");

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}



	public WebElement setemail()
	{
		return driver.findElement(email);
	}
	public WebElement setpassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickLogin()
	{
		return driver.findElement(clickLogin);
	}
}
