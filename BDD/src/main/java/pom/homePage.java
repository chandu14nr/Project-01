package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	@FindBy(linkText="Campaigns")
	private WebElement camp;

	@FindBy(partialLinkText="Logout")
	private WebElement logout;

	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogout()
	{
		logout.click();
	}
	public void setCampaignButton()
	{
		camp.click();
	}
}
