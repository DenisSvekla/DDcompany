package test.api;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.ApiEndpoint;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class testapi {


    private String linkForAvatar = "src/test/resources/111.jp";
    private String email = "llolloibibrippa-6119@yopmail.com";
    private String email_owner = "";
    Map<String, Object> company;

    @Test
    public void successfulCreateUser() {
        company =  new HashMap<>();
        company.put("email", "12adsdad34@gmail.com");
        company.put("name", "ООО");
        company.put("password","111222333");
        // setUpData();
        given()
                .body(company)
                .log().body()
                .when()
                .post(ApiEndpoint.GET_DO_REGISTER)
                .then().log().body()
                .statusCode(HttpStatus.SC_OK);

    }

}
