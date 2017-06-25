package com.planittesting.Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public abstract class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver=driver;
    }
    public void clickHomeMenu(){
        this.driver.findElement(By.cssSelector("#nav-home a")).click();
    }
    public void clickShopMenu(){
        this.driver.findElement(By.cssSelector("#nav-shop a")).click();
    }
    public void clickContactMenu(){
        this.driver.findElement(By.cssSelector("#nav-contact a")).click();
    }
    public void clickLogin(){
        this.driver.findElement(By.cssSelector("#nav-login a")).click();
    }
    public String getUsername(){
        return this.driver.findElement(By.cssSelector("#nav-user a")).getText();
    }

    public int getCartCount(){
        return Integer.parseInt(this.driver.findElement(By.cssSelector("#nav-cart a")).findElement(By.className("cart-count")).getText());
    }

}
