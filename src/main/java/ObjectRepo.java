package SeleniumTraining;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo {
	
	 static WebDriver driver;

	public static void main(String[] args)  {
	
		Properties props = new Properties();
		FileInputStream ip= new FileInputStream("D:/Selenium_Training/SeleniumTraining/src/SeleniumTraining/config.properties");
		props.load(ip);
		System.out.println(props.getProperty("name"));
		System.out.println(props.getProperty("age"));
		String url = props.getProperty("url");
		System.out.println("The Url is :"+ url);
		String browserName= props.getProperty("browser");
		System.out.println("The browser is :"+ browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if 
			(browserName.equals("FF"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\backup\\Selenium\\chromedriver_win32\\geckodriver.exe");
				driver= new ChromeDriver();
			}
		driver.get(url);
		driver.findElement(By.xpath(props.getProperty("Gmail_link")));
		driver.findElement(By.xpath(props.getProperty("Signin_link")));
		driver.findElement(By.xpath(props.getProperty("Email_xpath")));
		driver.findElement(By.xpath(props.getProperty("Next_button")));
		driver.findElement(By.xpath(props.getProperty("Username_xpath")));
		driver.findElement(By.id(props.getProperty("Password_id")));
		
		
		
	
			
		}
	
		
		
		
		
		
		

	}

}
