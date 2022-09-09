package Academy.E2EProjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Academy.E2EProjects.basee;
import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
public class HomePage extends basee {

	

	@Test(dataProvider= "getdata")
	
	public void basepagenavigation(String email, String password ) throws IOException, InterruptedException // after String password, String text
	{
		driver= initializeDriver();

		driver.manage().window().maximize();
	 driver.get("http://www.qaclickacademy.com/");
	
	
	    
	    LandingPage lp= new LandingPage(driver);
	    lp.getlogin().click();
	   
	  
	    
	    LoginPage lo=  new LoginPage(driver);
	    lo.setemail().sendKeys(email);
	    lo.setpassword().sendKeys(password);
	  //  System.out.println(text);
	     lo.clickLogin().click();
	    
	   
	}
	@DataProvider
	public Object[][] getdata() 
	{
		// row stands for how many different data types test should run
		// column stands for how many values per each test
		Object data[][] = new Object[2][2];
		
		data[0][0]= "abc@gmail.com";
		data[0][1]= "123456";
		   // data[0][2]= "Reastricted user";
		
		data[1][0]= "xyz@gmail.com";
		data[1][1]= "789456";
		//data[1][2]= "non Reastricted user";    
		
		return data;
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
