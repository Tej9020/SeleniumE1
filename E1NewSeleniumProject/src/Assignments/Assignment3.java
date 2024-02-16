package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver = new ChromeDriver();//To store the reference with ChromeDriver class
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.bluestone.com/");
		  Thread.sleep(3000);
		  
		 driver.findElement(By.xpath("//span[text()='Not now']")).click();
		  
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		  
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram']")).click();
		
		WebElement image = driver.findElement(By.id("5920"));
		act.moveToElement(image).perform();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  
		  File dest = new File("./screenshots/Assignment.png");
		 
		  FileHandler.copy(src, dest);
		  
		
	}

}
