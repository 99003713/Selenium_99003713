
import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Firefox_Frame{   
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Desktop\\geckodriver.exe");  // set path of 
    WebDriver driver = new FirefoxDriver();  
    driver.get("http://demo.automationtesting.in/Frames.html");
    Thread.sleep(2000);
    driver.manage().window().maximize();

		Thread.sleep(2000);
		
		
////	    Alert ..........................................................
//	    driver.findElement(By.className("btn-default")).click();
//	    Thread.sleep(5000); 
//	    driver.switchTo().alert().accept();
//	    
//	    driver.findElement(By.className("btn-lg")).click();
//	    Thread.sleep(5000); 
//	    driver.switchTo().alert().dismiss();
//		
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button")).click();
//	    Thread.sleep(5000); 
//	    driver.switchTo().alert().sendKeys("omprakash");
//	    driver.switchTo().alert().accept();
		 driver.switchTo().frame("SingleFrame");
		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Omprakash");
		 driver.switchTo().frame("Multiple");
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

//		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).sendKeys("harod");
	}

	
}
