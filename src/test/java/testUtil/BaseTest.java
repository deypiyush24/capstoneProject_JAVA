package testUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {


    public WebDriver driver;

    public WebDriver initializeDriver() {

        try {
            if (driver == null) {
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
                driver.manage().window().maximize();


            }
        } catch (Exception e) {
            System.out.println("Error in initialise driver");
        }
        return driver;

    }

    public void teardown(){
        driver.close();
        driver.quit();
    }
}
