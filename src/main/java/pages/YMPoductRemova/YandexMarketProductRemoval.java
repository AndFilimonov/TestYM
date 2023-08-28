package pages.YMPoductRemova;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import java.time.Duration;

public class YandexMarketProductRemoval extends BasePage {
    public YandexMarketProductRemoval(WebDriver driver) {
        super(driver);
    }

    public YandexMarketProductRemoval yandexMarketProductRemoval() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#vn_Oq').setAttribute('style', 'visibility:visible','opacity:1')");
        WebElement webElement = driver.findElement(By.xpath("//a[contains(text(),'Whiskas')]/..//div/div[@aria-label='Удалить']"));
        waitElement(webElement).click();
        return this;
    }

    public YandexMarketProductRemoval ClearAll() {
        WebElement webElement = driver.findElement(By.xpath("//button[@class='_1KpjX _1KU3s']"));
        waitElement(webElement).click();
        return this;
    }
}