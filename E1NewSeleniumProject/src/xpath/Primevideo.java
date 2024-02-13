package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primevideo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_b_brand27_mkw_4mEHKPKZ-dc?mrntrk=pcrid_75454108097584_slid__pgrid_1207264149347696_pgeo_155561_x__ptid_kwd-75454277835072:loc-90");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tejaskamble2449@gmail.com");
		
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    
	}

}
