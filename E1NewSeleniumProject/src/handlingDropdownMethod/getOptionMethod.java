package handlingDropdownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getOptionMethod {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
        
        driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/multiselectdropdown.html");
        
        WebElement mmdd = driver.findElement(By.id("Menu"));
         
        Select sel = new Select(mmdd);
        
        List<WebElement> option = sel.getOptions();
        for(int i=0; i<=option.size(); i++) {
        	String op = option.get(i).getText();
            System.out.println(op);
            }
        
        for(WebElement we : option) {
        	String ops = we.getText();
        	System.out.println(ops);
        }
        
	}
	

}
