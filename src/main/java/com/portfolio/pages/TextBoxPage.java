package com.portfolio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    private WebDriver driver;

    // Locadores (By)
    private By fullNameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By currentAddressInput = By.id("currentAddress");
    private By permanentAddressInput = By.id("permanentAddress");
    private By submitButton = By.id("submit");

    // Resultado al enviar
    private By nameOutput = By.id("name");
    private By emailOutput = By.id("email");

    // Constructor
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // Acciones de la página
    public void enterFullName(String name) {
        driver.findElement(fullNameInput).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterCurrentAddress(String address) {
        driver.findElement(currentAddressInput).sendKeys(address);
    }

    public void enterPermanentAddress(String address) {
        driver.findElement(permanentAddressInput).sendKeys(address);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    // Método de conveniencia para rellenar todo el formulario de una vez
    public void fillForm(String name, String email, String currentAddr, String permAddr) {
        enterFullName(name);
        enterEmail(email);
        enterCurrentAddress(currentAddr);
        enterPermanentAddress(permAddr);
    }

    // Métodos para obtener los resultados y hacer las aserciones
    public String getOutputName() {
        return driver.findElement(nameOutput).getText();
    }

    public String getOutputEmail() {
        return driver.findElement(emailOutput).getText();
    }
}