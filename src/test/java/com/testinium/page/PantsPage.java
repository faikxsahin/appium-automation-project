package com.testinium.page;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class PantsPage extends BasePage {

    Logger logger = LogManager.getLogger(PantsPage.class);

    @Step("<Scroll down>")
    public void scrollDown(String scroll) {
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.press(PointOption.point(536,1433)).moveTo(PointOption.point(536,478)).release().perform();
        System.out.println("Scrolled down");
        logger.info("Scrolled down");
    }

    @Step("Choose random product")
    public void selectRandomProduct(){
        Random rdn = new Random();
        List<MobileElement> pd = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        MobileElement element =  pd.get(rdn.nextInt(pd.size()));
        System.out.println("Random element selected");
        logger.info("Random element selected");
        element.click();
    }

    @Step("Check element with <id> product detail control")
    public void checkSizeText(String id) {
        String checkSizeText = appiumDriver.findElement(By.id(id)).getText();
        Assertions.assertEquals("Beden:", checkSizeText);
        System.out.println("Product Details Page Opened");
        logger.info("Product Details Page Opened");

    }

    @Step("Add to Cart - Click to the element with id <id>")
    public void clickCartButton(String id){
        appiumDriver.findElement(By.id(id)).click();
        System.out.println("Clicked to the element with id " + id);
        System.out.println("Add to Cart button clicked");
        logger.info("Add to Cart button clicked");
    }

}
