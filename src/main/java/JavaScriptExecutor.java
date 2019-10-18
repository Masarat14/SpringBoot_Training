package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.chapters.indigo.ca/en-ca/");
		driver.findElement(By.xpath("//button[@class ='browsepopup-closebtn']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(@data-menuid,51444)]"))).build().perform();
		driver.findElement(By.xpath("//button[@class ='browsepopup-closebtn']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='3_0']/a")).click();
		driver.findElement(By.xpath("//*[@id='child3_1']/li[5]/a")).click();
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='header__quick-search']"));
		flash(Search, driver);
		
	}

	public static void flash(WebElement element, WebDriver driver) {
		//JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	
	

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
	}

}
