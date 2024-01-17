package com.kodilla.rest.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class ExternalServicePostUpdateTest {

    @Test
    public void shouldUpdatePost() {
        String updatedPostBody = "{ \"title\": \"updated title\", \"body\": \"updated body\", \"userId\": 1 }";

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(updatedPostBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("updated title"))
                .body("body", equalTo("updated body"));
    }
}