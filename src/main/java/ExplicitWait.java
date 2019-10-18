package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 driver.findElement(By.id("id")).
		 
		 

	}
	public static void clickOn(WebDriver driver, WebElement locator,int timeout){
		new WebDriverWait(driver,timeout).ignoring(StaleElementReference)	
	}
	
	

}
//explicitly waiting for a specific element.if it is visible
//Example:if a state is selected then it has to wait until all the cities are loaded.