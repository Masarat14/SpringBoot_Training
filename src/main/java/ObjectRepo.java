package SeleniumTraining;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException  {
	
		Properties props = new Properties();
		FileInputStream ip= new FileInputStream("D:\\Selenium_Training\\SeleniumTraining\\src\\SeleniumTraining\\config.properties");
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
		//driver.findElement(By.xpath(props.getProperty("Gmail_link")));
		driver.findElement(By.linkText(props.getProperty("Gmail_link"))).click();
		driver.findElement(By.linkText(props.getProperty("Signin_link"))).click();
		Thread.sleep(4000);
		Set <String> handler =driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		
		driver.findElement(By.xpath(props.getProperty("Email_xpath"))).sendKeys(props.getProperty("Email"));
		driver.findElement(By.xpath(props.getProperty("Next_button"))).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(props.getProperty("Username_xpath"))).sendKeys(props.getProperty("Username"));
		driver.findElement(By.id(props.getProperty("Password_id"))).sendKeys(props.getProperty("Password"));
		
		driver.quit();
		
		
	
			
		}
	
		
		
		
		
		
		

	}


