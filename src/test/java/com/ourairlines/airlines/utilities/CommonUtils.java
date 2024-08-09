package com.ourairlines.airlines.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtils {



    public static void explicitWait(WebDriver driver, By locator, int timeout)   {


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));

        wait.until(ExpectedConditions.elementToBeClickable(locator));


    }



}
