package handlingDropdownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deselectAllMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
        
        driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/multiselectdropdown.html");
        
        WebElement mmdd = driver.findElement(By.id("Menu"));
         
        Select sel = new Select(mmdd);
        
        for(int i=0; i<=6; i++){
        	sel.selectByIndex(i);
        	Thread.sleep(2000);
        }
        sel.deselectAll();
        
        
        }

	}


