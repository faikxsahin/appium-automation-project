package com.testinium.page;

import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ProductDetailsPage extends BasePage {

    Logger logger = LogManager.getLogger(ProductDetailsPage.class);

    @Step("Favorites - Click to the element with id <id>")
    public void clickFavoritesButton(String id){
        appiumDriver.findElement(By.xpath(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Favorites button clicked");
        logger.info("Favorites button clicked");
    }

}
