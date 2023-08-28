package pages.YandexMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import java.time.Duration;

public class YandexMarket extends BasePage {

    public YandexMarket(WebDriver driver) {
        super(driver);
    }

    public YandexMarket catalogClick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By catalog = By.xpath("//div[@data-zone-name='catalog']");
        WebElement catalogEl = driver.findElement(catalog);
        waitElement(catalogEl).click();
        return this;
    }

    public YandexMarket categoryBring() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By category = By.xpath("//span[text()='Зоотовары']");
        Actions actions = new Actions(driver);
        WebElement categoryEl = driver.findElement(category);
        actions.moveToElement(waitElement(categoryEl)).build().perform();
        return this;
    }

    public YandexMarket subcategoryClick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By subcategory = By.xpath("//a[text()='Лакомства']");
        WebElement subcategoryEl = driver.findElement(subcategory);
        waitElement(subcategoryEl).click();
        return this;
    }
}
