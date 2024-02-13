package handlingDropdownMethod;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class removeDuplicates {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      
        
        driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/multiselectdropdown.html");
        
        WebElement msdd = driver.findElement(By.id("Menu"));
         
        Select sel = new Select(msdd);
        
       TreeSet<String> ts = new TreeSet<String>();
       
       List<WebElement> options = sel.getOptions();
       
       for(WebElement we : options)
       {
    	   String textToInsert = we.getText();
    	   
    	  ts.add(textToInsert);
    	  }
       
       for(String t : ts) {
    	   
    	   System.out.println(t);
    	   
    	
       }
       }

}
