import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drag {
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
    WebDriver driver = new ChromeDriver();  
    driver.get("https://emicalculator.net/");
    Thread.sleep(2000);
    driver.manage().window().maximize();

		Thread.sleep(2000);
		
		
		    WebElement source = driver.findElement(By.id("loanamountslider"));
		    Actions move = new Actions(driver);
		    move.dragAndDropBy(source, 200, 0).perform();
		    
		    
		    WebElement source1 = driver.findElement(By.id("loaninterestslider"));
		    Actions move1 = new Actions(driver);
		    move1.dragAndDropBy(source1, 200, 0).perform();
		    
		    WebElement source2 = driver.findElement(By.id("loantermslider"));
		    Actions move2 = new Actions(driver);
		    move2.dragAndDropBy(source2, 200, 0).perform();
		    
 
	}

	
}
