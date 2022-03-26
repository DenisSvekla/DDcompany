package baseEntities;

import core.ReadProperties;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class BaseApiTest {

    @BeforeClass
    public void setupApiTest() {

        RestAssured.baseURI = ReadProperties.getUrlApi();


        RestAssured.requestSpecification = given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .auth().preemptive().basic(ReadProperties.getUserNameForApi(), ReadProperties.getPasswordForApi());
    }
}
