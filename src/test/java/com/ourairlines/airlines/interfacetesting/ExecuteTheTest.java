package com.ourairlines.airlines.interfacetesting;

import com.ourairlines.airlines.utilities.WebDriverManager;

public class ExecuteTheTest {

    public static void main (String[] args) {


        LoginTestOfApp loginTestOfApp=new LoginTestOfApp();

        loginTestOfApp.loginSteps();
        loginTestOfApp.manager.TearDownTheDriver();





    }
}
