package pages.YandexMarketfilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.time.Duration;

import static constants.Constanst.Timeout.Implicit_Wait;

public class YandexMarketFilter extends BasePage {
    public YandexMarketFilter(WebDriver driver) {
        super(driver);
    }

    private By min_price = By.xpath("//div[@data-auto='filter-range-glprice']//span[@data-auto='filter-range-min']//input");
    private By max_price = By.xpath("//div[@data-auto='filter-range-glprice']//span[@data-auto='filter-range-max']//input");
    private By courier = By.xpath("//span[text()='Курьером']");

    public YandexMarketFilter yandexMarketFilter() {
        WebElement min_price_el = driver.findElement(min_price);
        waitElement(min_price_el).sendKeys("50");
        WebElement max_price_el = driver.findElement(max_price);
        waitElement(max_price_el).sendKeys("150");
        WebElement courierEl = driver.findElement(courier);
        waitElement(courierEl).click();
        return this;
    }

    public YandexMarketFilter yandexMarkeFiltertList() throws InterruptedException {
        By list = By.xpath("//span[text()='Показать всё']");
        WebElement listEl = driver.findElement(list);
        waitElement(listEl).click();
        By manufacturer = By.xpath("//div[@data-zone-name='filterSearchValueField']//input");
        WebElement manufacturerEl = driver.findElement(manufacturer);
        waitElement(manufacturerEl).sendKeys("Whiskas");
        waitElement(driver.findElement(By.xpath("//span[text()='Whiskas']"))).click();
        return this;
    }

    public YandexMarketFilter yandexMarkeFiltertReplaceManufacturer() {
        waitElement(driver.findElement(By.xpath("//span[text()='Whiskas']"))).click();
        By manufacturer = By.xpath("//input[@value='Whiskas']");
        WebElement manufacturerEl = driver.findElement(manufacturer);
        waitElement(manufacturerEl).clear();
        waitElement(driver.findElement(By.xpath("//div[@data-zone-name='filterSearchValueField']//input")))
                .sendKeys("Мнямс");
        waitElement(driver.findElement(By.xpath("//span[text()='Мнямс']"))).click();
        return this;
    }
}
