package methodsOfWebElement;


import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getSizeMethod {

	public static void main(String[] args) {
         
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 driver.get("http://127.0.0.1/login.do;jsessionid=qem4iy52irhw");
		 
		  WebElement username = driver.findElement(By.name("username"));
		  
		  org.openqa.selenium.Dimension size = username.getSize();
		 int height = size.height;
		 int width = size.width;
		 System.out.println("Height is :" + height + "  Width is : " + width);
	}

}
