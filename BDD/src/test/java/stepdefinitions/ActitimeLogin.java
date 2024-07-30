package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class ActitimeLogin {
	WebDriver d;
	@Given("User should enter {string} in the browser")
	public void user_should_enter_in_the_browser(String url) {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		d.get(url);	}
	@When("He enters username as {string}")
	public void he_enters_username_as(String un) {
		d.findElement(By.id("username")).sendKeys(un);	}
	@When("he enters password as {string}")
	public void he_enters_password_as(String pwd) {
		d.findElement(By.name("pwd")).sendKeys(pwd);	}
	@And("click on login button")
	public void click_on_login_button() {
		d.findElement(By.id("loginButton")).click();	}
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(d.getTitle());
		d.quit();
	}
}
