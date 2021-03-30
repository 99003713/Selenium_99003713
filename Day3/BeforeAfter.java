import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import javax.sound.midi.SysexMessage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfter {

	@BeforeMethod     // this method will execute before @test, every time
	public void first()
	{
		System.out.println("First");
	}
	@AfterMethod      // this method will execute after @test, every time
	public void last()
	{
	 System.out.println("Last");
	}
	
	@BeforeClass    // this method will execute once, before all methods
	public void fistclass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass    // this method will execute once, after all methods
	public void lastclass()
	{
		System.out.println("After class");
	}
	@Test
	public void A()
	{
		System.out.println('A');
	}
	
	@Test(priority = 1)
	public void B()
	{
		System.out.println('B');
	}
	@Test
	public void C()
	{
		System.out.println('C');
	}
}
