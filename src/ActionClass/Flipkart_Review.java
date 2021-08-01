package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Review {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	BaseClass.initializebrowser();
	driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9403059417");
	driver.findElement(By.xpath("//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Yogesh@07");
	driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("apple 12 mini");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span[3])")).getText();
	System.out.println(review);
		}
	
}
	
	
	
	
	
	
	
	
