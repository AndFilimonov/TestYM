package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.time.Duration;
import static common.Config.Platform_And_Browser;
import static constants.Constanst.Timeout.Implicit_Wait;

public class CommonActions {
    public static WebDriver creatDriver() {
        WebDriver driver = null;

        switch (Platform_And_Browser) {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                ChromeOptions chrome = new ChromeOptions();
                chrome.addArguments("user-agent=YOUR_USER_AGENT");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicit_Wait));
        return driver;
    }
}
