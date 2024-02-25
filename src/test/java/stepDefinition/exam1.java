package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testUtil.BaseTest;

public class exam1 extends BaseTest {
    private String urlValue;


    @Given("I launch the URL {string}")
    public void i_launch_the_url(String url) {
        driver = initializeDriver();
        driver.get(url);
        urlValue = url;

    }

    @When("I am on the HomePage")
    public void i_am_on_the_home_page() {

        Assert.assertEquals(driver.getCurrentUrl(), urlValue);
    }

    @Then("I validate the title {string} of the Page")
    public void i_validate_the_of_the_page(String titleValue) {
        Assert.assertEquals(driver.getTitle(), titleValue);
        System.out.println("Test 1 completed");
        driver.quit();

    }


}
