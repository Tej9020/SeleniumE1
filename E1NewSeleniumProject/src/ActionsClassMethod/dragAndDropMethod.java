package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	    driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		
		
		WebElement MobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement LaptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		
		Actions act = new Actions(driver);
		
		
		
		act.dragAndDrop(mobilecover, MobileAccessories).perform();
		act.dragAndDrop(mobileCharger, MobileAccessories).perform();
		act.dragAndDrop(laptopCharger,LaptopAccessories ).perform();
		act.dragAndDrop(laptopcover, LaptopAccessories).perform();
		
		

	}

}
