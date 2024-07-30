package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import generic.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateCampaign {
WebDriver driver= BaseClass.driver;
pom.CreateCamapign c=new pom.CreateCamapign(driver);
int time=1000;
@Given("User Should be present in CRM home page")
public void user_should_be_present_in_crm_home_page() {
	String actualTitle=driver.getTitle();
	String expectedTitle="Zoho CRM - Home Page";
	Assert.assertEquals(actualTitle, expectedTitle,"Home page title is not same");
}
@When("he clicks on campaign module")
public void he_clicks_on_campaign_module() {
	pom.homePage h=new pom.homePage(driver);
	h.setCampaignButton();
}
@Then("campaign page should be displayed")
public void campaign_page_should_be_displayed() {
	String actualTitle=driver.getTitle();
	String expectedTitle="Zoho CRM - Displaying Custom View Details";
	Assert.assertEquals(actualTitle, expectedTitle,"Create campaign page title is not same");
}
@And("he clicks on new campaign button")
public void he_clicks_on_new_campaign_button() {
	pom.campaignList cl=new pom.campaignList(driver);
	cl.setNewCampaignZoho();
}
@Then("create campaign page should be displayed")
public void create_campaign_page_should_be_displayed() {
	String actualTitle=driver.getTitle();
	String expectedTitle="Zoho CRM - Create Campaign";
	Assert.assertEquals(actualTitle, expectedTitle,"Create campaign page title is not same");
}

@And("he enters campaign name as {string}")
public void he_enters_campaign_name_as(String camp_name) {
	c.getCname().sendKeys(camp_name);
}

@And("he enters the start date as {string}")
public void he_enters_the_start_date_as(String s_date) {
	c.getPsdate().sendKeys(s_date);
}

@Then("he enters expected revenue as {string}, {string} as actual cost")
public void he_enters_expected_revenue_as_as_actual_cost(String e_revenue, String a_cost) {
	c.getPrevenue().sendKeys(e_revenue);
	c.getPcost().sendKeys(a_cost);
}

@And("he enters num sent as {string}")
public void he_enters_num_sent_as(String num_sent) {
	c.getPsent().sendKeys(num_sent);
}

@And("selects {string} in type dropdown, {string} in status dropdown")
public void selects_in_type_dropdown_in_status_dropdown(String type, String status) {
	WebDriverUtils w=new WebDriverUtils();
	WebElement items = c.getPtype();
	w.selDropdownUsingVisibleText(items, type);
	w.selDropdownUsingVisibleText(c.getPstatus(), status);
}

@Then("he enters the end date as {string}")
public void he_enters_the_end_date_as(String end_date) {
	c.getpedate().sendKeys(end_date);
}

@And("he enters budgeted cost as {string} , expected response as {string}")
public void he_enters_budgeted_cost_as_expected_response_as(String b_cost, String e_resp) {
	c.getPbcost().sendKeys(b_cost);
	c.getpresponse().sendKeys(e_resp);
}

@When("he enters the description as {string}")
public void he_enters_the_description_as(String desc) {
	c.getpdesc().sendKeys(desc);
}

@And("he clicks on save button")
public void he_clicks_on_save_button() {
	c.setsave();
}
@Then("created campaign name should be displayed as {string}")
public void created_campaign_name_should_be_displayed_as(String expString) {
	pom.campaignList cl=new pom.campaignList(driver);
	String actualCampaignName = cl.getCreatedCampaign().getText();
	boolean res = actualCampaignName.equals(expString);
	Assert.assertTrue(res,"Actual and expected campaign name are not same");
}

}
