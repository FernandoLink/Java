package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateABook() {
        given()
        .formParam("title", "Understating Quarkus")
        .formParam("author", "Antonio Goncalves")
        .formParam("year", 2020)
        .formParam("genre", "IT")
          .when().post("/api/books")
          .then()
             .statusCode(201)
             .body("isbn_13", startsWith("13-"))
             .body("title", is("Understating Quarkus"))
             .body("author", is("Antonio Goncalves"))
             .body("year_of_publication", is(2020))
             .body("genre", is("IT"))
             .body("creation_date", startsWith("20"))
             ;
    }

}