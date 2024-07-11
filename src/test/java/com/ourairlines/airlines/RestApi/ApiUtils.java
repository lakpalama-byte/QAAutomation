package com.ourairlines.airlines.RestApi;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

// PROVIDE ALL CONSTANTS HERE.
    public static final String GET_REQUEST_ENDPOINT= "/customers/1";
    public static final String POST_REQUEST_BODY= "   { \"name\": \"Jane Doe\", \"email\": \"jane.doe@example.com\" } ";

    public static final String BASE_URI="http://localhost:8081";




    static {

        RestAssured.baseURI=BASE_URI;
    }

    public static Response getRequest( String endPoint) {

        return given().when().get(endPoint).then().contentType(ContentType.JSON).extract().response();

    }

    public static Response postOrUpdate(String endPoint, Object body) {


        return given().body(body).post(endPoint);
    }





}
