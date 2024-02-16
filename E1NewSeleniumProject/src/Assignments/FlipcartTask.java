package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartTask {

	public static void main(String[] args) throws InterruptedException {
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16) );
		 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://www.flipkart.com/");
		 
		 
		 WebElement Searchtxtfield = driver.findElement(By.xpath("//input[@name='q']"));
		 Searchtxtfield.sendKeys("Hp laptop");
		
		 
		  WebElement searchicon = driver.findElement(By.xpath("//button[@type='submit']"));
		  searchicon.click();
		  
		  WebElement brandBtn = driver.findElement(By.xpath("//div[text()='Brand']"));
		  brandBtn.click();
		
		  
		   WebElement HP = driver.findElement(By.xpath("//div[text()='HP']"));
		   HP.click();
		 
		  Thread.sleep(1000);
		  
		   
		   WebElement core1 = driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling :: div[@class='_24_Dny']"));
		   core1.click();
		 
		   
		   List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		   List<WebElement> lap = driver.findElements(By.xpath("//div[@class='_4rR01T']/ ancestor :: div[@class='_3pLy-c row']/ descendant :: div[@class='_30jeq3 _1_WHN1']"));
		   
          for(int i=0; i < laptop.size(); i++)
          {
        	  String details = laptop.get(i).getText();
        	  
        	  
        	  
        	  for(int j=i; j<=i; j++)
        	  {
        		  String details2 = lap.get(j).getText();
        		  System.out.print(details + ":" +details2);
        		  Thread.sleep(1000);
        	  }
        	  System.out.println();
          }
        		  
        		  
        	  
          }
		 
		 
		 

	}


