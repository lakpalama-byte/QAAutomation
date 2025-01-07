package com.schoolmgmt.school.interfacetesting;

public class ExecuteTheTest {

    public static void main (String[] args) {


        LoginTestOfApp loginTestOfApp=new LoginTestOfApp();

        loginTestOfApp.loginSteps();
        loginTestOfApp.manager.TearDownTheDriver();





    }
}
