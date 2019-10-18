package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimulateBackwardForward {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //driver.get("https://jqueryui.com/droppable/");
		 driver.navigate().to("https://www.etihad.com/en-in/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
	}

}
//driver.navigate.to() is used to lanch external url
//launch the url
