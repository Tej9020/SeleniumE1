package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		 WebElement usnTextbox = driver.findElement(By.name("username"));
		  usnTextbox.sendKeys("_tej_9020");
		  Thread.sleep(1000);
		  
		  WebElement passTextbox = driver.findElement(By.name("password"));
		  passTextbox.sendKeys("mummypappa");
		  Thread.sleep(1000);
		  
		  WebElement loginButton = driver.findElement(By.className(""));
		  loginButton.click();
		  Thread.sleep(2000);
		  
		  
		  
		  
		  
		  
		  
		
		

	}

}
