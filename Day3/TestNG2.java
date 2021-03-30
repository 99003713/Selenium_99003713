import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG2 {
	WebDriver driver;
	
	@Test(priority = 1, description = "performing login", alwaysRun = true)
	public void login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Desktop\\geckodriver.exe");  // set path of 
	    driver = new FirefoxDriver();  
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@Test(priority = 2, description = "performing maximization of screen")
	public void max() {
		driver.manage().window().maximize();
	}
	
	@Test(priority = 3, description = "performing verification",dependsOnMethods = "max")
	public void Verify() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@Test(priority = 4, description = "performing closing screen", enabled = true)
	public void lose(){
	driver.close();
	}
	
}
