import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Get_text_Atrribute{
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
    WebDriver driver = new ChromeDriver();  
    driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
    Thread.sleep(2000);
    driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[5]/td[1]"));
	
		String s = ele.getText();
		System.out.println(s);
		
		
 
	}

	
}
