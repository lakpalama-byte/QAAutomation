package com.ourairlines.airlines.interfacetesting;

import com.ourairlines.airlines.utilities.CommonUtils;
import com.ourairlines.airlines.utilities.InterfaceUtils;
import com.ourairlines.airlines.utilities.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.ourairlines.airlines.utilities.InterfaceUtils.LOGIN_BUTTON;

public class LoginTestOfApp {

    WebDriverManager manager = new WebDriverManager();

    public void loginSteps() {
        manager.setDriver(InterfaceUtils.BROWSER);
        manager.getDriver().get(InterfaceUtils.BASE_URL);

        WebElement userNameField = manager.getDriver().findElement(By.xpath(InterfaceUtils.USERNAME_FIELD));
        WebElement passwordField = manager.getDriver().findElement(By.xpath(InterfaceUtils.PASSWORD_FIELD));
        WebElement loginButton = manager.getDriver().findElement(By.xpath((LOGIN_BUTTON)));

        userNameField.sendKeys(InterfaceUtils.USERNAME);
        passwordField.sendKeys(InterfaceUtils.PASSWORD);

        // Explicitly wait for the login button to be clickable
        CommonUtils.explicitWait(manager.getDriver(), By.xpath(LOGIN_BUTTON), 10);

        loginButton.click();
    }
}
