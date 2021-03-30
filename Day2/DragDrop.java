	import java.awt.Desktop.Action;
	import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class DragDrop{
		
		public static void main(String[] args) throws InterruptedException {
	    System.out.println("Wlcome to selenium ");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("http://demo.guru99.com/test/drag_drop.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();

			Thread.sleep(2000);
			
			WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]/li")); 
			Actions act=new Actions(driver);   
			act.dragAndDrop(From, To).build().perform();    
//			
		
			WebElement From1=driver.findElement(By.id("credit0"));
			WebElement To1=driver.findElement(By.id("amt8")); 
			Actions act1=new Actions(driver);   
			act1.dragAndDrop(From1, To1).build().perform();
	 
		}

		
	}
