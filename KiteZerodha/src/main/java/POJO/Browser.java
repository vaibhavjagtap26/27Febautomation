package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver openbrowser () {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vaibhav\\\\Documents\\\\update drver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	return driver;
	
}
}
