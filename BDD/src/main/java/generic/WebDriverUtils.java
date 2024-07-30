package generic;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class WebDriverUtils {
public void selDropdownUsingVisibleText(WebElement ele,String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
}
