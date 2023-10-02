package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RestTests {

    private static final String baseUrl = "https://reqres.in/";

    @Test
    public void checkAvatarAndIdTest(){
        List<UserData> users = given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .get(baseUrl + "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

    }

}
