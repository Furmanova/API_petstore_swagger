package petsstore.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import petsstore.utils.APITestsHelper;

import static org.junit.Assert.assertEquals;
import static petsstore.utils.Constants.getLoginAPIUrl;
import static petsstore.utils.Constants.postLoginAPIUrl;

public class UsersAPISteps extends APITestsHelper {
    private RequestSpecification request;
    private static Response response;



    @When("I make POST request for the endpoint 'user'")
    public void postRequestUser() {
       request = RestAssured.given().header("Access-Token", "application/json");
        request.header("Content-Type", "application/json");
        response = request.body(createUser()).post(postLoginAPIUrl);
        response.prettyPrint();
    }

    @Then("I see status code {}")
    public void statusCode(Integer code) {
        Integer statusCode = response.getStatusCode();
        assertEquals(code, statusCode);
    }

    @When("I make GET request for the endpoint 'user'")
    public void getRequestUser() {
        request = RestAssured.given().header("Access-Token", "application/json");
        response = request.get(getLoginAPIUrl);
    response.prettyPrint();
    }
}
