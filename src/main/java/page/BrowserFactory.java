package page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import gherkin.deps.net.iharder.Base64.InputStream;

public class BrowserFactory {
public static WebDriver driver;
	
	static String browser;
	static String url;
	
	
	public static void readconfig()
	{
		try
		{
			FileInputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
		   
			Properties prop = new Properties();
			
			prop.load(input);
			
			browser=prop.getProperty("browser");
			
			url = prop.getProperty("url");	
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static WebDriver init()
	{
		readconfig();
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
