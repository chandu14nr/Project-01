package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Google {
	WebDriver driver;
@Given("User should be present in google webpage")
public void user_should_be_present_in_google_webpage() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@When("He searchs for qspiders basavanagudi")
public void he_searchs_for_qspiders_basavanagudi() {
	driver.findElement(By.name("q")).sendKeys("Qspiders Basavanagudi"+Keys.ENTER);
}

@Then("Qspiders page should be displayed")
public void qspiders_page_should_be_displayed() {
	System.out.println(driver.getTitle());
}
}
