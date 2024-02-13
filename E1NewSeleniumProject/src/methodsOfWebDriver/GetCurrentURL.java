package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.get("https://www.flipcart.com/");
		  Thread.sleep(2000);
		  
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);

	}

}
