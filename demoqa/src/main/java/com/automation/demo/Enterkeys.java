package com.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Enterkeys extends BaseTest {

  private WebDriver driver;

    public Enterkeys(WebDriver driver) {
        this.driver = driver;
    }


    public boolean keys()
    {
WebElement cc=driver.findElement((By.className("gLFyf")));
cc.sendKeys("Test Hello");
cc.sendKeys(Keys.ENTER);
return true;
    }



    
}
