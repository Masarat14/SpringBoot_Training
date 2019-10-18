package SeleniumTraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\backup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentId=it.next();
		System.out.println("The Parent Window Id is :" + parentId);
		String childId=it.next();
		System.out.println("The Child Window Id is :" + childId );
		driver.switchTo().window(childId);
		String title = driver.getTitle();
		System.out.println("The child window Title is " + title );
		driver.close();
		driver.switchTo().window(parentId);
		String ParentTitle= driver.getTitle();
		System.out.println("The Parent Window Title is :"  + ParentTitle );
		driver.quit();
		
		
		
		
		

	}

}
