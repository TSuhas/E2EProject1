package Academy.E2EProjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Academy.E2EProjects.basee;
import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
public class HomePage2 extends basee {

	@BeforeTest
	public void initiliaze() throws IOException
	{
driver= initializeDriver();

		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}

	@Test
	
	public void basepagenavigation() throws IOException, InterruptedException // after String password, String text
	{
		driver= initializeDriver();

		driver.manage().window().maximize();
	    driver.get("http://www.qaclickacademy.com/");
	  //  driver.close();
	 // to see the text present on the page. create object of LandingPage 
	    LandingPage lp= new LandingPage(driver);
	   // lp.getlogin().click();
	    
	   // lp.getresult().getText();
	   Assert.assertEquals(lp.getresult().getText(), "FEATURED COURSES");
	    
	  
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
