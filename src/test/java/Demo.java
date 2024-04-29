import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
    @Test
    void first(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }
}
