package com.planittesting.Test;

import com.planittesting.Models.Pages.HomePage;
import com.planittesting.Models.Pages.ShopPage;
import com.planittesting.Models.Product.CompareByPrice;
import com.planittesting.Models.Product.CompareByTitle;
import com.planittesting.Models.Product.Product;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nicolasmaffiold on 23/6/17.
 */
public class ShopTest extends BaseTest {

    @Test
    public void addToCartTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickShopButton();

        ShopPage shopPage = new ShopPage(driver);

        Product productPrice = shopPage.getProduct(new CompareByPrice(9.99));
        productPrice.clickBuyButton();
        Product productTitle = shopPage.getProduct(new CompareByTitle("Teddy Bear"));
        productTitle.clickBuyButton();

        Assert.assertEquals(shopPage.getCartCount(),2);


    }


}
