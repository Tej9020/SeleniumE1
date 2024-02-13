package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();//To launch chrome browser
		 driver.manage().window().maximize();//To maximize the window
		 driver.get("https://www.instagram.com/?hl=en");//
		 Thread.sleep(2000);
		 
		 //To finnd/locate password textbox and pass the inputs
		 WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label*=' usernam']"));
		 usnTB.sendKeys("_tej_9020");
		 Thread.sleep(2000);
		 
		 //To finnd/locate password textbox and pass the inputs
		 WebElement passTB = driver.findElement(By.cssSelector("input[type='password']"));
		 passTB.sendKeys("password@123");
		 Thread.sleep(2000);
		 
		 //To click on login button
		 WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		 loginButton.click();
		
		 
	}    

}
