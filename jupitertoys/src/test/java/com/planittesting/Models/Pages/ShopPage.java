package com.planittesting.Models.Pages;

import com.planittesting.Models.Product.CompareStrategy;
import com.planittesting.Models.Product.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by nicolasmaffiold on 23/6/17.
 */
public class ShopPage extends BasePage {

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public Product getProduct(CompareStrategy strategy) throws Exception {

        List<WebElement> elements = driver.findElements(By.className("product"));
        for (WebElement element : elements) {
            Product product = new Product(element);
            if (strategy.compareProduct(product)) return product;
        }
        throw new Exception("Product not found");

    }
}
