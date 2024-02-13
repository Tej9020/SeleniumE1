package handlingDropdownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/Singleselect.html");
		
		WebElement singleSelect = driver.findElement(By.id("Menu"));
		
		 Select sel = new Select(singleSelect);
		 
		 //To select an option by using the index value.
		 sel.selectByIndex(4);
		 Thread.sleep(4000);
		 
		 //To select an option by using the value of the option.
		 sel.selectByValue("v4");
		 Thread.sleep(3000);
		 
		 //To select an option by using the text value of the option
		 sel.selectByVisibleText(" misal paav ");
		 Thread.sleep(4000);
		 
		 
		
		
		
	}

}
