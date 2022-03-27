package test.api;

import baseEntities.BaseDataBaseTest;
import core.ReadProperties;
import dataBaseEntries.ForAvatarTable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import utils.ApiEndpoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiTestWithDataBase extends BaseDataBaseTest {

    public static Logger logger = Logger.getLogger(ApiTestWithDataBase.class);

    private int id;
    private String email;
    private String link;
    Map<String, Object> avatar;

    @Test
    public void successfulChangeAvatar() {
        setUpData();
        avatar = new HashMap<>();
        avatar.put("email", email);
        avatar.put("avatar", link);

        given()
                .body(avatar, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(ApiEndpoint.GET_CHANGE_AVATAR)
                .then().log().body()
                .statusCode(HttpStatus.SC_OK);

    }


    public void setUpData() {
        ForAvatarTable customersTable = new ForAvatarTable(dataBaseService);
        ResultSet rs = customersTable.getDataForChangeAvatarById();

        try {
            while (rs.next()) {
                id = rs.getInt("id");
                email = rs.getString("email");
                link = rs.getString("link");

                logger.info("id: " + id);
                logger.info("email: " + email);
                logger.info("link: " + link);
            }
        } catch (SQLException e) {
            logger.error(e.toString());
        }


        RestAssured.baseURI = ReadProperties.getUrl();
        RestAssured.requestSpecification = given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .auth().preemptive().basic(ReadProperties.getEmail(), ReadProperties.getPassword());
    }

}
