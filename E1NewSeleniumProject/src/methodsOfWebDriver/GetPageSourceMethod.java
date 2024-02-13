package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Youtube.com/");
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
