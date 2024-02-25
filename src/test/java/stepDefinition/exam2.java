package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testUtil.BaseTest;

public class exam2 extends BaseTest {

    @Given("launch the URL {string}")
    public void i_launch_the_url(String url) {
        driver = initializeDriver();
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        driver.findElement(By.xpath("//li/a[@href='/abtest']")).click();

    }
    @Then("Verify the text {string}")
    public void verify_the_text(String validation) {
        WebElement pageTextElement = driver.findElement(By.tagName("h3"));
        String pageText = pageTextElement.getText();
        Assert.assertEquals(pageText, validation);
        driver.quit();

    }

}
