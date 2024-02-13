package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("tejas kamble");
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("password@123");
		Thread.sleep(1000);
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button.click();

	}

}
