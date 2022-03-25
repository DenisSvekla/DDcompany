package test.api;

import baseEntities.BaseApiTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.ApiEndpoint;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiTest extends BaseApiTest {

    @Test
    public void asdasd() {
        given()
                .when()
                .get(ApiEndpoint.GET_Booking_ID)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getBookById() {
        given()
                .pathParam("id", 1)
                .get(ApiEndpoint.GET_BOOK_ON_ID)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getBookById1() {
        given()
                .pathParam("id", 5000)
                .get(ApiEndpoint.GET_BOOK_ON_ID)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
    @Test
    public void successfulCreateUser() {
        Map<String, Object> book =  new HashMap<>();
        book.put("firstname", "bla bla");
        book.put("lastname", "Оddd");
        book.put("totalprice",22);
        book.put("depositpaid",false);
        book.put("additionalneeds","want create");

        given()
                .body(book)
                .log().body()
                .when()
                .post(ApiEndpoint.BOOKING)
                .then().log().body()
                .statusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
    }
}
