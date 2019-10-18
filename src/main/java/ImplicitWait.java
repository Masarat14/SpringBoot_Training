package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 
		 
	}

}
//Implicit wait is a dynamic wait.its applicable for all web element and its a global wait.
//it will wait until all the element are fully loaded.
//Thread.sleep is hard wait.Script will be totally paused for the time specified.
//whereas in dynamic wait if element is found in 5 sec out of 30 sec specified ,then remaining 25 sec are ignored
