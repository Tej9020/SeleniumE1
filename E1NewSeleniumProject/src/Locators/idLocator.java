package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		 WebElement usnTextbox = driver.findElement(By.id("email"));
		  usnTextbox.sendKeys("Email");
		  Thread.sleep(1000);
		  
		  WebElement passTextbox = driver.findElement(By.id("pass"));
		  passTextbox.sendKeys("password");
		  Thread.sleep(1000);
		  
		  WebElement loginButton = driver.findElement(By.name("login"));
		  loginButton.click();
		  
		  
		  
		  
		  
		  
		  
		
		

	}

}
