package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="userName")
	private WebElement untex;

	@FindBy(id="passWord")
	private WebElement pwtex;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogin(String un,String pwd)
	{
		untex.sendKeys(un);
		pwtex.sendKeys(pwd+Keys.ENTER);
	}

}
