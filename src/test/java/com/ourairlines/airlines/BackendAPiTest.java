package com.ourairlines.airlines;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import org.junit.jupiter.api.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Feature("Customer API Tests")
public class BackendAPiTest {


    @BeforeClass

    public void setUp()   {

        RestAssured.baseURI="http://localhost:8080";



    }


    @Test

    @Story("Retrieve Customer with ID")
    @Description("This test retrieve the an existing customer with its ID")

    public void testGetCustomerByID() {

        try {

            String url = "/customers/1";
            System.out.println("Request URL: " + RestAssured.baseURI + url);

            Response response = given()
                    .when()
                    .get(url)
                    .then()
                    .contentType(ContentType.JSON)
                    .extract().response();

            Assert.assertEquals(response.getStatusCode(), 200);
            Assert.assertEquals(response.jsonPath().getString("name"), "John Doe");


        }
        catch(Exception e) {
            throw e;
        }

    }


    @Test

    public void testCreateNewCustomer  ()   {


        String requestBody=   "   { \"name\": \"Jane Doe\", \"email\": \"jane.doe@example.com\" } ";


        System.out.println("Request Body: " + requestBody);


        Response response =given ()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/customers")
                .then()
                .contentType(ContentType.JSON)
                .extract().response();

        System.out.println("Response: " + response.asString());



    }





    @Test

    public void testUpdateNewCustomer () {


        String requestBody = "   {  \"name\": \"Lakpa Lama\", \"email\": \"lakpa.lama@example.com\" }   ";


        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/customers/1")
                .then()
                .contentType(ContentType.JSON)
                .extract().response();

        System.out.println(requestBody);





    }







    @Test
    public void testDeleteCustomer() {
        Response response = given()
                .when()
                .delete("/customers/1")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 204);
    }










}
