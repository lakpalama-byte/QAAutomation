package com.schoolmgmt.school.RestApi;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.schoolmgmt.school.RestApi.ApiUtils.GET_REQUEST_ENDPOINT;
import static io.restassured.RestAssured.given;


@Feature("Customer API Tests")

public class TestBackendApi {

    @Test

    @Story("Retrieve Customer with ID")
    @Description("This test retrieve the an existing customer with its ID")

    public void testGetCustomerByID() {

        Response response = ApiUtils.getRequest(GET_REQUEST_ENDPOINT);
        Assert.assertEquals(200, response.getStatusCode());

    }


    @Test

    public void testCreateNewCustomer() {
    }


    @Test

    public void testUpdateNewCustomer() {


    }


    @Test
    public void testDeleteCustomer() {

    }


}




