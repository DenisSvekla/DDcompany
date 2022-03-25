package stepsCucumber;

import baseEntities.BaseApiTest;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class ApiTestCucumberDef extends BaseApiTest {

    private String linkForAvatar;
    private String email;

    @When("successful add NewAvatar")
    public void successfulAddNewAvatar() {

        given()
                .body(project, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(endpoint)
                .then().log().body()
                .statusCode(HttpStatus.SC_OK);


    }

    public void setUpData () {


    }

}
