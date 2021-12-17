package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lumen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lumen.com/en-us/home.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'SOLUTIONS')]")))
		.moveToElement(driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'By Industry')]")))
		.click(driver.findElement(By.xpath("(//a[@class='tier-link '][contains(.,'Retail')])[2]"))).build().perform();
		Thread.sleep(10000);
		driver.quit();
		
		//driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'SOLUTIONS')]")).
		//driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'By Industry')]")).click();
		//driver.findElement(By.xpath("(//a[@class='tier-link '][contains(.,'Retail')])[2]")).click();
		
		
	}

}
