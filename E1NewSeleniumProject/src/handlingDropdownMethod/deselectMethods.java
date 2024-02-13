package handlingDropdownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deselectMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
        
        driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/multiselectdropdown.html");
        
        WebElement mmdd = driver.findElement(By.id("Menu"));
         
        Select sel = new Select(mmdd);
        
        sel.selectByIndex(3);
      Thread.sleep(3000);
      sel.deselectByIndex(3);
        
        Thread.sleep(2000);
        
       sel.selectByValue("v3");
        Thread.sleep(3000);
        sel.deselectByValue("v3");
        
        Thread.sleep(2000);
        
        sel.selectByVisibleText("poha");
        Thread.sleep(2000);
        sel.deselectByVisibleText("poha");
        
        
	}

}
