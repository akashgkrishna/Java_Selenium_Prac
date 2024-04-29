import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
     Test class for web automation.
 */
public class WebAutomationTest {

    /**
         Sample test method to demonstrate web automation.
     */
    @Test
    void sampleWebAutomationTest() {
        // Set up Chrome WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to Google homepage
        driver.get("http://www.google.com");

        // Perform actions (e.g., interact with elements, assert conditions)

        // Close the WebDriver instance
        driver.quit();
    }
}
