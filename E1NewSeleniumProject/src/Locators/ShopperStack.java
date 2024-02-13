package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		  loginButton.click();
		  Thread.sleep(2000);
		  
		  WebElement usnTextbox = driver.findElement(By.id("Email"));
		  usnTextbox.sendKeys("alibaba1122@gmail.com");
		  Thread.sleep(2000);
		
		  WebElement passTextbox = driver.findElement(By.id("Password"));
		  passTextbox.sendKeys("Password@123");
		  Thread.sleep(2000);
		  
		  WebElement loginButton1 = driver.findElement(By.name("Login"));
		  loginButton1.click();
		  Thread.sleep(2000);
		
	}

}
