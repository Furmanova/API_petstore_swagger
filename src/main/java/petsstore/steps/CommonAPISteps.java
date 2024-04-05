package petsstore.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;


import io.restassured.specification.RequestSpecification;
import petsstore.utils.APITestsHelper;

import static petsstore.utils.Constants.postLoginAPIUrl;


public class CommonAPISteps extends APITestsHelper {

    //common step to build the client and receive token
    // instance variable token exists in APITestsHelper class
    @Given("I have access token")
    public void accessToken() {
        RequestSpecification request = RestAssured.given()

              .header("Content-Type", "application/json");
        Response response = request.body(createUser()).post(postLoginAPIUrl);
        token = response.getHeader("Access-Token");

    }
}
