package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("alibaba1122@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		

	}

}
