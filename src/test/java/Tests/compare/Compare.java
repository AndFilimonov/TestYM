package Tests.compare;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;
import pages.YMProductSelection.YandexMarketProductSelection;
import pages.YandexMarketfilter.YandexMarketFilter;

import java.time.Duration;

import static constants.Constanst.Timeout.Implicit_Wait;
import static constants.Constanst.Urls.Home_yandex_market;

public class Compare extends BaseTest {

    @Test
    public void checksubcategory() throws InterruptedException {
        basePage.open(Home_yandex_market);

        yandexMarket
                .catalogClick()
                .categoryBring()
                .subcategoryClick();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicit_Wait));
        yandexMarketFilter
                .yandexMarketFilter()
                .yandexMarkeFiltertList();

        yandexMarketProductSelection
                .yandexMarketProductSelection1();

        yandexMarketSwitch
                .yandexMarketSwitch1();

        yandexMarketCompare
                .yandexMarketCompare();

        yandexMarketSwitch
                .yandexMarketSwitch0();

        yandexMarketFilter
                .yandexMarkeFiltertReplaceManufacturer();

        yandexMarketProductSelection
                .yandexMarketProductSelection2();

        yandexMarketSwitch
                .yandexMarketSwitch1();

        yandexMarketCompare
                .yandexMarketCompare();

        yandexMarketCompare
                .yandexMarketCompareProducts()
                .yandexMarketCompareMnyams()
                .yandexMarketCompareWhiskas()
                .yandexMarketComparePrice1()
                .yandexMarketComparePrice2()
                .yandexMarketComparePrice();

        yandexMarketProductRemoval
                .yandexMarketProductRemoval();

        yandexMarketCompare
                .yandexMarketCompareDeletProduct();

        yandexMarketProductRemoval
                .ClearAll();

        yandexMarketCompare
                .yandexMarketCompareClearAll();
    }
}
