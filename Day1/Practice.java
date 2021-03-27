import java.security.DomainCombiner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of chrome driver
    WebDriver driver = new ChromeDriver();   // create object of chromedriver
    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    
    
//  maximize window...................................................
    driver.manage().window().maximize();
    
// Accessing web elements................................................    
//    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//    driver.findElement(By.id("btnLogin")).click();
//    driver.findElement(By.name("txtUsername")).click();
//    driver.findElement(By.id("user-message")).sendKeys("Admin");
//    Thread.sleep(5000); 
//    driver.findElement(By.id("at-cv-lightbox-close")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.className("btn-default")).click();

    
//    Alert ..........................................................
//    driver.findElement(By.className("btn-default")).click();
//    Thread.sleep(5000); 
//    driver.switchTo().alert().accept();
//    
//    driver.findElement(By.className("btn-lg")).click();
//    Thread.sleep(5000); 
//    driver.switchTo().alert().dismiss();
  
//   Drop Down.........................................................
//     Select dd = new Select(driver.findElement(By.id("select-demo")));
//     dd.selectByVisibleText("Sunday");
//     Thread.sleep(2000);
//     dd.selectByIndex(3);
//     Thread.sleep(2000);
//     dd.selectByValue("Friday");
   
    
//    Scroll............................................................
//     JavascriptExecutor js = (JavascriptExecutor) driver;
//     js.executeScript("window.scrollBy(0,1000)");  // scroll down page by 100 pixel vertically   
     
	}
	
}
