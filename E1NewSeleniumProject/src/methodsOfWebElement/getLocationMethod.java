package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getLocationMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2awe71n098buq");
		
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		Point location = loginbtn.getLocation();
		int xaxis = location.getX();
		int yaxis = location.getY();
		
		System.out.println("X-axis is : " + xaxis + "  Y-axis is : " + yaxis);
		
	}

}
