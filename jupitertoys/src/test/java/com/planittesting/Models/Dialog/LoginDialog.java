package com.planittesting.Models.Dialog;


import com.planittesting.Models.Data.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public class LoginDialog {

    protected WebElement element;

    public LoginDialog (WebDriver driver, LoginData data){
        element= driver.findElement(By.className("popup"));

        if(data.getLogin()!=null){
            this.setUsername(data.getLogin());
        }
        if(data.getPassword()!=null){
            this.setPassword(data.getPassword());
        }




    }

    public void setUsername(String username){
        element.findElement(By.cssSelector("#loginUserName")).sendKeys(username);
    }
    public void setPassword(String password){
        element.findElement(By.cssSelector("#loginPassword")).sendKeys(password);
    }
    public void clickLoginButton(){
        element.findElement(By.className("btn-primary")).click();
    }

}
