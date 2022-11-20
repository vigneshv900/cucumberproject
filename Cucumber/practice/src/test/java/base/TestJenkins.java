package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJenkins {
WebDriver driver;
	@BeforeMethod
	public void setUp()
 {
		System.out.println("Befire");
		}
	
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After");
		driver.quit();
	}
	}
