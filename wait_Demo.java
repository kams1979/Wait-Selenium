package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_Demo  {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Thread.sleep(5000);//comes from java
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//comes from selenium driver
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kams");
	}
	
	
	
	

}
