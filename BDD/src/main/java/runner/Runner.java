package runner;
import io.cucumber.testng.*;

@CucumberOptions(features="featurefiles",
glue={"stepdefinitions"},dryRun = false,
plugin = {"html:target/output.html","json:target/output1.json"},
monochrome = true,tags = "@Actitime")
public class Runner extends AbstractTestNGCucumberTests {

}