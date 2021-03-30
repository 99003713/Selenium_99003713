import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;
	
	@Test(priority = 1)
	public void login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Desktop\\geckodriver.exe");  // set path of 
	    driver = new FirefoxDriver();  
	    driver.get("http://demo.automationtesting.in/Frames.html");
	}
	
	
	@Test(priority = 2)
	public void max() {
		driver.manage().window().maximize();
	}
	
	@Test(priority = 3)
	public void Single() {
		driver.switchTo().frame("SingleFrame");
		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Omprakash");
	}
	
	
	@Test(priority = 4)
	public void lose(){
		driver.close();
	}
	
}
