package hooks;
import io.cucumber.java.*;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass {
	public static WebDriver driver;
	generic.FileLib f=new generic.FileLib();
	@Before(order=1)
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
	String url = f.getPropertyData("url");
	driver.get(url);
	System.out.println("openBrowser");
}
	@Before(order=2)
public void login() throws IOException {
		pom.LoginPage l=new pom.LoginPage(driver);
		String un = f.getPropertyData("un");
		String pwd = f.getPropertyData("pwd");
		l.setLogin(un, pwd);
	System.out.println("login");
}
	@After(order=2)
public void logout() {
		pom.homePage h=new pom.homePage(driver);
		h.setLogout();
	System.out.println("Logout");
}
	@After(order=1)
public void closeBrowser() {
	driver.quit();
	System.out.println("closeBrowser");
}
}
