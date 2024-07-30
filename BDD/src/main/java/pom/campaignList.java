package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignList {

	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcamp;

	@FindBy(id = "value_Campaign Name")
	private WebElement createdCampaign;
	public WebElement getCreatedCampaign() {
		return createdCampaign;
	}
	public campaignList(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setNewCampaignZoho()
	{
		newcamp.click();
	}
}
