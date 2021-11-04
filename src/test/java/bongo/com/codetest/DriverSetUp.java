package bongo.com.codetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
public static WebDriver driver;
	
	@BeforeSuite
	public static void Driversetup() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public static void close() {
		driver.close();
	}

}
