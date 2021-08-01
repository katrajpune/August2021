package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Actions act = new Actions(driver);
	 WebElement eng = driver.findElement(By.xpath("//*[@title=\"English (UK)\"]"));
	
	act.moveToElement(eng).click().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
act.moveToElement(month).click();
for(int i=1;i<=12;i++)
{
	act.sendKeys(Keys.ARROW_DOWN).perform();	
	
}
	//move to desire location
for(int i=1;i<=1;i++)
{
	act.sendKeys(Keys.ARROW_UP).click().perform();
}
	

	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
