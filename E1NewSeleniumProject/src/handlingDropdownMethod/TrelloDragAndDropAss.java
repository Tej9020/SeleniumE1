package handlingDropdownMethod;

import java.time.Duration;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDropAss {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("ghanshyamtaur120@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Sham@111");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("(//div[text()='E1'])")).click();
		
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement sqlSrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement manualSrc = driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
		WebElement seleniumSrc = driver.findElement(By.xpath("//a[text()='SELENIUM']"));
		WebElement apiSrc = driver.findElement(By.xpath("//a[text()='API']"));
		
		WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='mock Given']"));
		WebElement mockpendingTarget = driver.findElement(By.xpath("//textarea[text()='mock Pending']"));
		WebElement mockscheduleTarget = driver.findElement(By.xpath("//textarea[text()='mock Schedule']"));
		
	    Actions act = new Actions(driver);
		act.dragAndDrop(javaSrc, mockGivenTarget).perform();
		act.dragAndDrop(sqlSrc, mockGivenTarget).perform();
		act.dragAndDrop(manualSrc, mockGivenTarget).perform();
		act.dragAndDrop(seleniumSrc, mockpendingTarget).perform();
		act.dragAndDrop(apiSrc, mockscheduleTarget).perform();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
		
		for(int i=0 ; i < options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		Thread.sleep(1000);
			
		
		
		
		
		
		
	}

}
