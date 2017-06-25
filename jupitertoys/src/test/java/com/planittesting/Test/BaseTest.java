package com.planittesting.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by nicolasmaffiold on 22/6/17.
 */
public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Before
    public void testSetup(){
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.navigate().to("http://jupiter.cloud.planittesting.com/");
    }
    @After
    public void cleanup(){
       // driver.quit();
    }
}
