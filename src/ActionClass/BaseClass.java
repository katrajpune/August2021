package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 static WebDriver driver;
	
public static void initializebrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

}}
