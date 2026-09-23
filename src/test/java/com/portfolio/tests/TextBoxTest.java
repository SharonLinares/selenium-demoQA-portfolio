package com.portfolio.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.portfolio.pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void testSubmitFormSuccessfully() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        TextBoxPage textBoxPage = new TextBoxPage(driver);

        String name = "Sharon Test";
        String email = "sharon@test.com";
        String currentAddress = "Calle Mayor 123, Madrid";
        String permanentAddress = "Avenida Principal 456, Madrid";

        textBoxPage.fillForm(name, email, currentAddress, permanentAddress);
        textBoxPage.clickSubmit();

        Assert.assertTrue(textBoxPage.getOutputName().contains(name), "El nombre mostrado no coincide.");
        Assert.assertTrue(textBoxPage.getOutputEmail().contains(email), "El email mostrado no coincide.");

        // Pausa de 4 segundos para ver el resultado en pantalla
        Thread.sleep(4000);
    }
}