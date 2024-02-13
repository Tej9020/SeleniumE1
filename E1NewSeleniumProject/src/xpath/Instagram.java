package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("_tej_9020");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mummypappa");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
		
	}

}
