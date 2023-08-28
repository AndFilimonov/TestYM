package pages.YMProductSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.base.BasePage;
import java.time.Duration;

public class YandexMarketProductSelection extends BasePage {

    public YandexMarketProductSelection(WebDriver driver) {
        super(driver);
    }

    public YandexMarketProductSelection yandexMarketProductSelection1 () {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        By product = By.xpath("//div[@data-index=0]//div[@class='_2im8- _2S9MU _2jRxX'][1]//a");
        WebElement productEl = driver.findElement(product);
        waitElement(productEl).click();
        return this;
        /*waitElement(driver.findElement(By.xpath("//div[@data-index=0]//div[@class='_2im8- _2S9MU _2jRxX'][1]//a"))).click();
        return this;*/
    }

    public YandexMarketProductSelection yandexMarketProductSelection2 () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By product = By.xpath("//div[@data-index=0]//div[@class='_2im8- _2S9MU _2jRxX'][2]//a");
        WebElement productEl = driver.findElement(product);
        waitElement(productEl).click();
        return this;
    }
}
