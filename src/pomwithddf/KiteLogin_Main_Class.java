package pomwithddf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class KiteLogin_Main_Class   {
	XSSFSheet sh;
static	WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\August2021\\TestData\\exceldata.xlsx");
		XSSFWorkbook yg = new XSSFWorkbook(file);
		XSSFSheet sh = yg.getSheetAt(0);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\August2021\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		KiteLogin1 lg1 = new KiteLogin1(driver);
		 lg1.inputusername(sh.getRow(0).getCell(0).getStringCellValue());
		 lg1.inputpassword(sh.getRow(0).getCell(1).getStringCellValue());
		lg1.clickbutton();
		 Thread.sleep(2000);
		 KiteLogin2 lg2 =new KiteLogin2(driver);
		 Thread.sleep(2000);
		 lg2.inputpin(sh.getRow(0).getCell(2).getStringCellValue());
		 lg2.pressbtn();
		
		
	}

	
	
	
}
