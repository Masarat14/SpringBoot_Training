package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java Interview Questions");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='close-div']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		
		
		//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/div/center/input[1])]")).click();
		//driver.close();

	}

}
