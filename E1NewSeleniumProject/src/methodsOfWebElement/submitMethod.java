package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class submitMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
        driver.get("https://www.instagram.com/?hl=en");
        
        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbtn.submit();
        
	}

}
