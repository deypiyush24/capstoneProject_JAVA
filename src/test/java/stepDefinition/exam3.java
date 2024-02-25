package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import testUtil.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class exam3 extends BaseTest {

    private Select select;

    @Given("I click the URL {string}")
    public void i_click_the_url(String url) {
        driver = initializeDriver();
        driver.get(url);

    }

    @When("I click on the dropdown link")
    public void i_click_on_the_dropdown_link() {
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

    }

    @Then("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String option) {

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select =new Select(dropdown);
        select.selectByValue("1");


    }

    @Then("I confirm that {string} is selected")
    public void i_confirm_that_is_selected(String option) {

        WebElement selectedOption = driver.findElement(By.xpath("//option[@selected='selected']"));
        Assert.assertEquals(option, selectedOption.getText());
        driver.quit();
        System.out.println("Test 3 completed");
        driver.quit();
    }
}
