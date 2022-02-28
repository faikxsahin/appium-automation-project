package com.testinium.page;

import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    Logger logger = LogManager.getLogger(LoginPage.class);

    @Step("Login - Check the button with id <id>")
    public void checkLoginPageText(String id) {
        String checkText = appiumDriver.findElement(By.id(id)).getText();
        Assertions.assertEquals("Beni Hatırla", checkText);
        System.out.println("Login Page opened");
        logger.info("Login Page opened");
    }

    @Step("ID - element <id> write <text>")
    public void sendKeysID(String id,String text){
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        System.out.println("Find element with " + id + " write " + text);
    }

    @Step("Password - element <id> write <text>")
    public void sendKeysPassword(String id,String text){
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        System.out.println("Find element with " + id + " write " + text);
    }

    @Step("Back - Click to the element with id <id>")
    public void clickBackButton(String id){
        appiumDriver.findElement(By.id(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Back button clicked");
        logger.info("Back button clicked");
    }



}
