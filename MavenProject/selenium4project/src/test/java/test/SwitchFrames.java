package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrames {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		WebElement we = driver.findElement(By.cssSelector(".moneyiframe"));
		driver.switchTo().frame(we);
		System.out.println(driver.findElement(By.id("nseindex")).getText());
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(1);
		jse.executeScript("scroll(0,400)");	
		driver.findElement(By.linkText("Alert")).click();	
		Thread.sleep(5000);
		jse.executeScript("scroll(0,-400)");
		driver.findElement(By.linkText("AbstractAnnotations")).click();	
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.navigate().refresh();*/
	}
}