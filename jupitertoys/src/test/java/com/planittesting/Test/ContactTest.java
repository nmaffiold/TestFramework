package com.planittesting.Test;

import com.planittesting.Models.Data.ContactData;
import com.planittesting.Models.Pages.ContactPage;
import com.planittesting.Models.Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public class ContactTest extends BaseTest {

    @Test
    public void checkErrorMessages() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactMenu();

        ContactData contactData = new ContactData();
        ContactPage contactPage = new ContactPage(driver, contactData);

        contactPage.clickSubmitButton();

        Assert.assertEquals("Forename is required",contactPage.getFornameError());
        Assert.assertEquals("Email is required",contactPage.getEmailError());
        Assert.assertEquals("Message is required",contactPage.getMessageError());

    }

    @Test
    public void checkSuccesMessage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickContactMenu();

        ContactData contactData = new ContactData().withForname("Mike").withSurename("Marsh").withEmail("w@w.com").withTelephone("123455").withMessage("well we all knew it would come down to this");;

        ContactPage contactPage = new ContactPage(driver, contactData);

        contactPage.clickSubmitButton();

        Assert.assertEquals("Thanks "+ contactData.getForename()+", we appreciate your feedback.",contactPage.getSuccessMessage());


    }
}
