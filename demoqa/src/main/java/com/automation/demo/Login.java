package com.automation.demo;

import org.openqa.selenium.WebDriver;

public class Login extends BaseTest {
      private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
public boolean Google()
{
driver.get("https://www.google.com");
    return true;
}
}
