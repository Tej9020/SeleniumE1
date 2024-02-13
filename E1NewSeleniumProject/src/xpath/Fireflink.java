package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("kambletejas1730@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("Tejas@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
