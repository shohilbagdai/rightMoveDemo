package com.rightmove.autoqa.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rightmove.autoqa.commons.Utilities;
import com.rightmove.autoqa.commons.WebDriverCommons;
import com.rightmove.autoqa.commons.WebDriverFactory;
/**
 * 
 * @author Auto QA team
 *
 */
public class PropertySearchResultPage extends Page<PropretyResultPageElements> {

    WebDriverCommons webDriverCommons = new WebDriverCommons();

    PropretyResultPageElements propretyResultPageElements;

    Utilities utils = new Utilities();

    @Override
    public boolean isPageLoaded() {
        return webDriverCommons.isDisplayed(propretyResultPageElements.infoMessageHeader);
    }

    @Override
    public void init() {
        propretyResultPageElements = new PropretyResultPageElements();
        super.initialiseElements(propretyResultPageElements);

    }

    @Override
    public PropretyResultPageElements getPageElements() {
        return propretyResultPageElements;
    }

    public void selectGivenOptinFromSortByDropdown(String option) {
        webDriverCommons.selectFromDropdown(propretyResultPageElements.sortTypeDropdown, option);
    }

    public void selectFirstNonFeatureProperty() throws InterruptedException {

        utils.timeInterval(4);
        List<WebElement> nonFeaturedProperties = WebDriverFactory.getWebDriver()
                                                                 .findElements(By.xpath(
                                                                         ".//div[@class='l-searchResult is-list']//div[@class='propertyCard' or @class='propertyCard propertyCard--premium']  "));

        for (int i = 0; i < nonFeaturedProperties.size(); i++) {
            webDriverCommons.click(nonFeaturedProperties.get(i));
            break;
        }

    }

}
