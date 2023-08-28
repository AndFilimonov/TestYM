package pages.YMCompare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YandexMarketCompare extends BasePage {
    public YandexMarketCompare(WebDriver driver) {
        super(driver);
    }


    private By compare = By.xpath("//div[@data-auto='compare-button']");

    public YandexMarketCompare yandexMarketCompare() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement compareEl = driver.findElement(compare);
        waitElement(compareEl).click();
        return this;
    }

    public YandexMarketCompare yandexMarketCompareProducts() {
        By button = By.xpath("//a[text()='Сравнить']");
        WebElement buttonEl = driver.findElement(button);
        waitElement(buttonEl).click();
        return this;
    }

    public YandexMarketCompare yandexMarketCompareWhiskas() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String string = driver.findElement(By.xpath("//a[contains(text(),'Whiskas')]")).getText();
        Assert.assertTrue(string.contains("Whiskas"));
        return this;
    }

    public YandexMarketCompare yandexMarketCompareMnyams() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String string = driver.findElement(By.xpath("//a[contains(text(),'Мнямс')]")).getText();
        Assert.assertTrue(string.contains("Мнямс"));
        return this;
    }

    public YandexMarketCompare yandexMarketComparePrice1() {
        String price= waitElement(driver.findElement(By.xpath("(//div[@class='_3NaXx _1ri69'])[1]"))).getAttribute("innerText");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(price);
        while (matcher.find()) {
            Price1 = Integer.parseInt(matcher.group());
        }
        return this;
    }

    public YandexMarketCompare yandexMarketComparePrice2() {
        String price= waitElement(driver.findElement(By.xpath("(//div[@class='_3NaXx _1ri69'])[2]"))).getAttribute("innerText");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(price);
        while (matcher.find()) {
            Price2 = Integer.parseInt(matcher.group());
        }
        return this;
    }

    public YandexMarketCompare yandexMarketComparePrice() {
        Boolean price = null;
        if (Price1 + Price2 > 300) {
            price = true;
        } else {
            price = false;
        }
        Assert.assertTrue(price);
        return this;
    }

    public YandexMarketCompare yandexMarketCompareDeletProduct() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By by = By.xpath("//a[contains(text(),'Whiskas')]");
        Assert.assertFalse(driver.findElements(by).isEmpty());
        return this;
    }

    public YandexMarketCompare yandexMarketCompareClearAll() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        By by = By.xpath("//h2[text()='Сравнивать пока нечего']");
        String string = driver.findElement(by).getText();
        Assert.assertTrue(string.contains("Сравнивать пока нечего"));
        return this;
    }
}
