package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateCRM {
public static void main(String[] args) throws InterruptedException {WebDriver driver=new EdgeDriver();
int time=2000;
Thread.sleep(time);
driver.get("http://192.168.197.128:8080/crm/HomePage.do");Thread.sleep(time);
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");Thread.sleep(time);
driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);Thread.sleep(time);
driver.findElement(By.linkText("Campaigns")).click();Thread.sleep(time);
driver.findElement(By.xpath("//input[@value='New Campaign']")).click();Thread.sleep(time);
driver.findElement(By.name("property(Campaign Name)")).sendKeys("thor car");Thread.sleep(time);
driver.findElement(By.name("property(Start Date)")).sendKeys("07/07/2024");Thread.sleep(time);
driver.findElement(By.name("property(Expected Revenue)")).sendKeys("3600000");Thread.sleep(time);
driver.findElement(By.name("property(Actual Cost)")).sendKeys("3000000");Thread.sleep(time);
driver.findElement(By.name("property(Num sent)")).sendKeys("20");Thread.sleep(time);
WebElement items = driver.findElement(By.name("property(Type)"));Thread.sleep(time);
Select s=new Select(items);Thread.sleep(time);
s.selectByVisibleText("Advertisement");Thread.sleep(time);
WebElement status= driver.findElement(By.name("property(Status)"));
Select s1=new Select(status);Thread.sleep(time);
s1.selectByVisibleText("Active");Thread.sleep(time);
driver.findElement(By.name("property(End Date)")).sendKeys("07/15/2024");Thread.sleep(time);
driver.findElement(By.name("property(Budgeted Cost)")).sendKeys("1000000");Thread.sleep(time);	
driver.findElement(By.name("property(Expected Response)")).sendKeys("100");Thread.sleep(time);
driver.findElement(By.name("property(Description)")).sendKeys("thor is a excelent car");Thread.sleep(time);
driver.findElement(By.xpath("//input[@value='Save']")).click();Thread.sleep(time);}
}
