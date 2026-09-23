package com.portfolio.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    private By doubleClickBtn = By.id("doubleClickBtn");
    private By doubleClickMessage = By.id("doubleClickMessage");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void doubleClickButton() {
        wait.until(ExpectedConditions.elementToBeClickable(doubleClickBtn));
        actions.doubleClick(driver.findElement(doubleClickBtn)).perform();
    }

    public String getDoubleClickMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(doubleClickMessage)).getText();
    }
}