package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJenkins {

	@BeforeMethod
	public void setUp()
 {
		System.out.println("Befire");
		}
	
	
	@Test
	public void test()
	{
		
		System.out.println("TEst");
		}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After");
	}
	}
