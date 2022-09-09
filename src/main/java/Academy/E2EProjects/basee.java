package Academy.E2EProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class basee {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		 prop= new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\eclipse-java-2022-06-R-win32-x86_64\\E2EProjects\\src\\main\\java\\Academy\\E2EProjects\\data.properties");
		
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		
		if(browsername.equals("chrome"))
		{
			// execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
			
		   driver= new ChromeDriver();
		}
	/*	else if (browsername.equals("Firefox"))
		{
			//execute in firefox browser
			 System.setProperty("webdriver.gecko.driver", "pathToGeckoDriver + '\\geckodriver.exe' ");
			 WebDriver driver = new FirefoxDriver();
		}
		else if (browsername.equals("IE"))
		{
			//execute in IE browser
			System.setProperty("webdriver.ie.driver", "Path of IE file \\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver(); 
		}*/
		
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
