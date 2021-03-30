import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseAction {
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
    WebDriver driver = new ChromeDriver();  
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    Thread.sleep(2000);
    driver.manage().window().maximize();
  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  driver.findElement(By.id("btnLogin")).click();
//  driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
//  driver.findElement(By.id("confirm_password")).sendKeys("admin123");
//  driver.findElement(By.xpath("//input[@value='Verify']")).click();  //absolute xpath used
//  //*[@id="frmPurgeEmployeeAuthenticate"]/div/div/input   //relative xpath
  
	  	WebElement ele=driver.findElement(By.linkText("Leave"));
	  	Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.linkText("Entitlements"));
	  	Actions act3= new Actions(driver);
		act3.moveToElement(ele3).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_leave_viewLeaveEntitlements")).click();
		

	
 
 
	}

	
}
