package com.ourairlines.airlines.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    private static WebDriver driver;


    public void setDriver(String driverName) {


        switch (driverName.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("unsupported browser:   " + driverName);


        }


        driver.get("google.com");
        driver.manage().window().maximize();


    }

    public WebDriver getDriver() {
        return driver;
    }

    public void TearDownTheDriver() {
        // if the driver is not empty, stop the execution of driver and clear the data.

        if (driver != null) {

            driver.quit();

        }


    }
}
