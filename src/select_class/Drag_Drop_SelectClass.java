package select_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop_SelectClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}
