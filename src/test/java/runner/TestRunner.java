package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/java/features",
        glue="stepDefinition",
        monochrome = true,
        plugin = {"pretty","html:target/cucumberReport.html"},
        tags = "@exam"
)
public class TestRunner  extends AbstractTestNGCucumberTests {
}
