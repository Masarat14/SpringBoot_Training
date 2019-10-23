package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		WebDriver driver;
		 
		System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The text is  : " + driver.findElement(By.cssSelector("p")).getText());
        driver.close();
        
	}

}
