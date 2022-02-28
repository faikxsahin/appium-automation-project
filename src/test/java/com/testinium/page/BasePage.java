package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {

    Logger logger = LogManager.getLogger(BasePage.class);

    @Step("Wait <wait> seconds")
    public void waitForSeconds(int wait) throws InterruptedException {
        Thread.sleep(1000 * wait);
    }

    @Step("Check if the app opens and press the start shopping button")
    public void controlStartPageButton() throws InterruptedException {
        if (appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).isDisplayed()){
            System.out.println("Start shopping button become visible");
            logger.info("Start shopping button become visible");
            appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).click();
            System.out.println("Start shopping button clicked");
            logger.info("Start shopping button clicked");
        }
    }

}
