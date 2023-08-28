package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constanst.Timeout.Explicit_Wait;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
        window1 = driver.getWindowHandle();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    protected String window1 = null;
    protected String windows2 = null;
    protected Integer Price1 = null;
    protected Integer Price2 = null;

    public WebElement waitElement(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(Explicit_Wait)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
