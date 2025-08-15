package com.automation.demo;
import org.openqa.selenium.WebDriver;
 
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = BrowserUtils.Browser();
    }

    // @AfterClass
    // public void tearDown() {
    //     DriverFactory.quitDriver();
    // }
}
