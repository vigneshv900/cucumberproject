package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
protected static WebDriver driver;

private String getUrl() throws IOException  {
	
	FileReader reader = new FileReader("./src/test/resources/env.properties");
	Properties p = new Properties();
	p.load(reader);
	String value = p.getProperty("url");
	return value;
}
public TestBase() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	
}

public static WebDriver getDriver() {
	return driver;
}
public void launchUrl() throws IOException {
	driver.get(getUrl());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}


public void tearDown() {
	if(driver!=null) {
		driver.close();
	}
}
}
