package test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SwitchWindows {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		System.out.println("Parent Window Title = "+driver.getTitle());
		String PW = driver.getWindowHandle();
		System.out.println("Parent Window handle = "+PW);
		driver.findElement(By.linkText("Selenium Practice")).click();
		driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[6]/a")).click();
		System.out.println("Parent Window2 Title = "+driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> cwh = driver.getWindowHandles();
		Iterator<String> cwi = cwh.iterator();
		cwi.next();
		String CW = cwi.next();
		driver.switchTo().window(CW);
		System.out.println(driver.getTitle());
		System.out.println(CW);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().window(PW);
		Thread.sleep(5000);
		driver.navigate().back();
		String nw = driver.getWindowHandles();
				
		
	}
		//driver.quit();*/
}
