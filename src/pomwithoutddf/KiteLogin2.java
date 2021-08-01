package pomwithoutddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2 {
@FindBy(xpath="//*[@id=\"pin\"]")private WebElement pin;
@FindBy(xpath="//*[@class='button-orange wide']")private WebElement loginbtn;

public KiteLogin2 (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public void inputpin()
{
	pin.sendKeys("959594");
}
public void pressbtn()
{
	loginbtn.click();
}



}
