import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Desktop\\chromedriver.exe");  // set path of 
    WebDriver driver = new ChromeDriver();  
    driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE");
    driver.manage().window().maximize();
    Thread.sleep(2000);
  
    driver.findElement(By.name("firstname")).sendKeys("OMPRAKASH");
    driver.findElement(By.name("lastname")).sendKeys("HAROD");
    driver.findElement(By.name("reg_email__")).sendKeys("harod@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("harod@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("9669208436");
    
  Select dd = new Select(driver.findElement(By.id("day")));
  dd.selectByValue("15");
  Thread.sleep(2000);
  Select dd2 = new Select(driver.findElement(By.id("month")));
  dd2.selectByValue("7");
  Thread.sleep(2000);
  Select dd3 = new Select(driver.findElement(By.id("year")));
  dd3.selectByValue("1996");
  Thread.sleep(2000);

  
  WebElement radio=driver.findElement(By.cssSelector("input[value='2']"));
  radio.click();
  
  driver.findElement(By.name("websubmit")).click();
     
	}

	
}
