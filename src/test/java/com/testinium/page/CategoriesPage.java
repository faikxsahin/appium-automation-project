package com.testinium.page;

import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CategoriesPage extends BasePage {

    Logger logger = LogManager.getLogger(CategoriesPage.class);

    @Step("Woman - Click to the element with id <id>")
    public void clickWomanButton(String id){
        appiumDriver.findElement(By.xpath(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Woman button clicked");
        logger.info("Woman button clicked");
    }

    @Step("Pants - Click to the element with id <id>")
    public void clickPantsButton(String id){
        appiumDriver.findElement(By.xpath(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Pants button clicked");
        logger.info("Pants button clicked");
    }

}
