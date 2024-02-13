package ActionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class releaseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	    driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	    
	    driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
	    
	    //to find theelement to be clicked and hold
	    WebElement ClickAndHold = driver.findElement(By.xpath("//div[@id='circle']"));
	    
	    Actions act = new Actions(driver);//To create the object os Action class
	    act.clickAndHold(ClickAndHold).perform();//To perform click and hold operation
	    
	    Thread.sleep(5000);
	    act.release(ClickAndHold).perform();//To perfore release operation
	}

}
