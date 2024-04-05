package petsstore.utils;


import org.json.JSONObject;
import org.openqa.selenium.json.JsonException;


public class APITestsHelper {
    protected static String token;



    protected APITestsHelper() {
    }

    //create user using hard-coded credentials
    protected String createUser() throws JsonException {
        return new JSONObject()
                .put("id","1")
                .put("username", "pertov")
                .put("firstName", "Mark")
                .put("lastName", "Petrov")
                .put("email", "test111@gmail.com")
                .put("password", "12345")
                .put("phone", "1234565433")
                .put("userStatus", "3").toString();




    }

    }
