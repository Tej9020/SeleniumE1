import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver = new ChromeDriver();//To store the reference with ChromeDriver class
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(2000);
		  
		  WebElement loginbtn = driver.findElement(By.xpath("div[text()='Log in'"));
		  
		  File scr = loginbtn.getScreenshotAs(OutputType.FILE);
		  
		  File dest = new File("./screenshots/instagram.png");//To specify the location ,name and extension of screenshot.
			 
			 Files.copy(scr, dest);//To copy and paste the screenshot in the specified folder.

	}

}
