package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		 
		 WebDriver driver = new ChromeDriver();//To launch the browser
		 driver.manage().window().maximize();// To maximize the browser window
		 driver.get("file:///C:/Users/nikit/OneDrive/Desktop/webelements/Textfboxhtml.html");//To launch web application
		 Thread.sleep(2000);
		 
		 WebElement textbox = driver.findElement(By.tagName("input"));//Find password text field on the web page
		 
		 textbox.sendKeys("manager");// Pass the inputs to password text field
		 
		 //Note : Inputs are passed to username text field it is the 1st element designed with input tag .

	}

}
