import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ICICI {
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
    WebDriver driver = new ChromeDriver();  
    driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
    Thread.sleep(2000);
    driver.manage().window().maximize();

	  Thread.sleep(2000);
		
	  driver.findElement(By.id("carRelbtn")).click();
	  driver.findElement(By.xpath("//*[@id=\"relDropDown\"]/li[2]/a/span[1]")).click();
	  driver.findElement(By.id("MOBILENUM")).sendKeys("9669208463");
	  driver.findElement(By.name("CUSTFIRSTNAME")).sendKeys("Omprakash");
	  driver.findElement(By.name("CUSTLASTNAME")).sendKeys("Harod");
	  driver.findElement(By.name("CUSTCOMMUCITY")).sendKeys("UJJAIN");
	  Thread.sleep(500);
	  driver.findElement(By.name("CUSTCOMMUCITY")).sendKeys(Keys.DOWN); 
	  Thread.sleep(500);
	  driver.findElement(By.name("CUSTCOMMUCITY")).sendKeys(Keys.ENTER); 
       
	  Thread.sleep(500);
	  driver.findElement(By.id("residancebtn")).click();
	  driver.findElement(By.linkText("Owned")).click();
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("yrspan_mvce")).click();
	  driver.findElement(By.linkText("2020")).click();
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("mnthbtn")).click();
	  driver.findElement(By.linkText("Jan")).click();
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("DATEOFBIRTH")).sendKeys("15/07/1996"); 
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("HONDA JAZZ V");
	  Thread.sleep(500);
	  driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.DOWN); 
	  Thread.sleep(500);
	  driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ENTER);
	  
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("CITY_NAME")).sendKeys("UJJAIN");
	  Thread.sleep(500);
	  driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.DOWN); 
	  Thread.sleep(500);
	  driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ENTER); 
	  
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("CAR_MODEL_PRIZE")).click();
	  
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("selSalbtn")).click();
	  driver.findElement(By.linkText("Salaried")).click();
	  
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("EMPLOYERNAME")).sendKeys("AMAZON INDIA PVT LTD");
	  Thread.sleep(500);
	  driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.DOWN); 
	  Thread.sleep(500);
	  driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ENTER);
	 
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("yrspan_we")).click();
	  driver.findElement(By.linkText("2020")).click();
	  
	  
	  
      Thread.sleep(500);
	  
	  driver.findElement(By.id("mnthspan_we")).click();
	  driver.findElement(By.linkText("Jan")).click();
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("totalworkexp")).click();
	  driver.findElement(By.linkText("1")).click();
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("50000");
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("70000");
	  
	  
	  
	  Thread.sleep(500);
	  driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("10000");
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("eligibility-btn")).click();
	  

	}

	
}
