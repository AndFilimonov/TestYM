package Tests.Base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.YMCompare.YandexMarketCompare;
import pages.YMPoductRemova.YandexMarketProductRemoval;
import pages.YMProductSelection.YandexMarketProductSelection;
import pages.YMSwitch.YandexMarketSwitch;
import pages.base.BasePage;
import pages.YandexMarketfilter.YandexMarketFilter;
import pages.YandexMarket.YandexMarket;

import static common.Config.Browser_Open;
import static common.Config.Clear_Cookies_and_Storage;

public class BaseTest {
    protected WebDriver driver = CommonActions.creatDriver();
    protected BasePage basePage = new BasePage(driver);
    protected YandexMarket yandexMarket = new YandexMarket(driver);
    protected YandexMarketFilter yandexMarketFilter  = new YandexMarketFilter(driver);
    protected YandexMarketProductSelection yandexMarketProductSelection = new YandexMarketProductSelection(driver);
    protected YandexMarketSwitch yandexMarketSwitch = new YandexMarketSwitch(driver);
    protected YandexMarketCompare yandexMarketCompare = new YandexMarketCompare(driver);
    protected YandexMarketProductRemoval yandexMarketProductRemoval= new YandexMarketProductRemoval(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (Clear_Cookies_and_Storage) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite
    public void close() {
        if(Browser_Open) {
            driver.quit();
        }
    }
}
