package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16) );
		 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("http://127.0.0.1/login.do;jsessionid=qem4iy52irhw");
		 
		 driver.findElement(By.id("loginButton")).click();
		 

	}

}
