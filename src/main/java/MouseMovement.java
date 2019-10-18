package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.etihad.com/en-in/");
		String Title = driver.getTitle();
		System.out.println(Title);
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Realme")).click();
		//driver.quit();

	}

}
