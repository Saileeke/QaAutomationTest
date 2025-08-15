package com.automation.demo;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils 
{

    public static  WebDriver Browser()
    {
        
    
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

         return driver;
    }
    
}