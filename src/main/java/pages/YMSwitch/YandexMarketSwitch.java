package pages.YMSwitch;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Set;

public class YandexMarketSwitch extends BasePage {
    public YandexMarketSwitch(WebDriver driver) {
        super(driver);
    }
    Set< String> currentWindows= null;

    public YandexMarketSwitch yandexMarketSwitch1() {
        window1 = driver.getWindowHandle();
        System.out.println(window1);
        Set< String> currentWindows= driver.getWindowHandles();
        for (String window: currentWindows) {
            if (!window.equals(window1)) {
                windows2 = window;
            }
        }
        driver.switchTo().window(windows2);
        return this;
    }

    public YandexMarketSwitch yandexMarketSwitch0() {
        driver.close();
        driver.switchTo().window(window1);
        return this;
    }
}
