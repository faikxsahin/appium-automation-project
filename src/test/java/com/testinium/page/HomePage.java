package com.testinium.page;

import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    Logger logger = LogManager.getLogger(HomePage.class);

    @Step("Market - Check the button with id <id>")
    public void checkHomePageText(String id) {
        String checkText = appiumDriver.findElement(By.id(id)).getText();
        Assertions.assertEquals("Market", checkText);
        System.out.println("Home Page opened");
        logger.info("Home Page opened");
    }

    @Step("Categories - Click to the element with id <id>")
    public void clickCategoriesButton(String id){
        appiumDriver.findElement(By.id(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Categories button clicked");
        logger.info("Categories button clicked");
    }

}



