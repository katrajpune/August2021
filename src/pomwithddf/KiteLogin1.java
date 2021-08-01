package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1 {

	@FindBy(xpath="//*[@type='text']")private WebElement UN;
	@FindBy(xpath="//*[@type='password']")private WebElement Pwd;
	@FindBy(xpath="//*[@type='submit']")private WebElement Btn;
	
	public KiteLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void  inputusername(String name)
	{
		UN.sendKeys(name);
	
	}
	public void inputpassword(String pasword)
	{
		Pwd.sendKeys(pasword);
		
	}
	public void clickbutton()
	{
		Btn.click();
	}
	
	
	
	
	
}
