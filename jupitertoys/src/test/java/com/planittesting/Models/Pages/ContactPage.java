package com.planittesting.Models.Pages;

import com.planittesting.Models.Data.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public class ContactPage extends BasePage {


    public ContactPage(WebDriver driver, ContactData data) {
        super(driver);
        if (data.getForename() != null) {
            this.setFornameText(data.getForename());
        }
        if (data.getSurname() != null) {
            this.setSurnameText(data.getSurname());
        }
        if (data.getEmail() != null) {
            this.setEmailText(data.getEmail());
        }
        if (data.getTelephone() != null) {
            this.setTelephoneText(data.getTelephone());
        }
        if (data.getMessage() != null) {
            this.setMessageText(data.getMessage());
        }
    }

    public void setFornameText(String forename) {
        this.driver.findElement(By.cssSelector("#forename")).sendKeys(forename);
    }

    public void setSurnameText(String surname) {
        this.driver.findElement(By.cssSelector("#surname")).sendKeys(surname);
    }

    public void setEmailText(String email) {
        this.driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }

    public void setTelephoneText(String telephone) {
        this.driver.findElement(By.cssSelector("#telephone")).sendKeys(telephone);
    }

    public void setMessageText(String message) {
        this.driver.findElement(By.cssSelector("#message")).sendKeys(message);
    }

    public void clickSubmitButton(){
        this.driver.findElement(By.className("btn-contact")).click();
    }

    public String getFornameError(){
        return this.driver.findElement(By.cssSelector("#forename-err")).getText();
    }
    public String getEmailError(){
        return this.driver.findElement(By.cssSelector("#email-err")).getText();
    }
    public String getMessageError(){
        return this.driver.findElement(By.cssSelector("#message-err")).getText();
    }
    public String getSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 60 );
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")));
        return this.driver.findElement(By.className("alert-success")).getText();
    }




}
