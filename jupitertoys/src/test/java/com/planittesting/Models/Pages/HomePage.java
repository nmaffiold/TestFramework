package com.planittesting.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickShopButton() {
        driver.findElement(By.className("btn-success")).click();
    }
}
