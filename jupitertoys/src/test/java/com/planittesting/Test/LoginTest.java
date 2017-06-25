package com.planittesting.Test;

import com.planittesting.Models.Data.LoginData;
import com.planittesting.Models.Dialog.LoginDialog;
import com.planittesting.Models.Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(driver);

        homePage.clickLogin();
        LoginData data = new LoginData().withLogin("Mike").withPassword("letmein");
        LoginDialog dialog = new LoginDialog(driver,data);

        dialog.clickLoginButton();

        Assert.assertEquals(data.getLogin(),homePage.getUsername());

    }
}
