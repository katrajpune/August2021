package pomwithoutddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KiteLogin_Main_Class {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 KiteLogin1 lg1 = new KiteLogin1(driver);
		 lg1.inputusername();
		 lg1.inputpassword();
		 lg1.clickbutton();
		 Thread.sleep(2000);
		 KiteLogin2 lg2 =new KiteLogin2(driver);
		 Thread.sleep(2000);
		 lg2.inputpin();
		 lg2.pressbtn();
		
		
	}

	
	
	
}
