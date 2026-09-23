package com.portfolio.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.portfolio.pages.ButtonsPage;

public class ButtonsTest extends BaseTest {

    @Test
    public void testDoubleClickButton() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.doubleClickButton();

        String message = buttonsPage.getDoubleClickMessage();
        Assert.assertEquals(message, "You have done a double click", "El mensaje de doble clic no es correcto.");

        Thread.sleep(2000);
    }
}