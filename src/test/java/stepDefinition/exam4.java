package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testUtil.BaseTest;

import java.util.List;

public class exam4 extends BaseTest {

    @Given("click the URL {string}")
    public void click_the_url(String url) {
        driver = initializeDriver();
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

    }

    @When("I click on the {string}")
    public void i_click_on_the(String string) {

        WebElement framesLink = driver.findElement(By.linkText("Frames"));
        framesLink.click();
        List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
        boolean nestedFramesFound = false;
        boolean iFrameFound = false;

        for (WebElement link : hyperlinks) {
            if (link.getText().equals("Nested Frames")) {
                nestedFramesFound = true;
            }
            if (link.getText().equals("iFrame")) {
                iFrameFound = true;
            }
        }

        if (nestedFramesFound && iFrameFound) {
            System.out.println("Both Nested Frames and iFrame hyperlinks are presented on the Frames Page.");
        } else {
            System.out.println("One or both of the hyperlinks (Nested Frames and iFrame) are not presented on the Frames Page.");
        }

    }

    @Then("I verify that the following hyperlinks are presented on the Frames Page Nested Frames and  iFrame")
    public void i_verify_that_the_following_hyperlinks_are_presented_on_the_frames_page_nested_frames_and_i_frame() {
        System.out.println("Hello");
        driver.quit();
    }
}
