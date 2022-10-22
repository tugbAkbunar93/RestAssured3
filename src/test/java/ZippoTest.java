import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ZippoTest {



    @Test
    public void test() {

        given()  // hazırlık işlemlerini yapacağız


        .when()  // linki ve metodu veriyoruz


        .then()  // assertion ve verileri ele alma extract

        ;

    }

    @Test
    public void statusCodetest() {

        given()

                .when()
                .get("http://api.zippopotam.us/us/90210")


                .then()
                .log().body()  // log.All()  --> bütün responsu gösterir
                .statusCode(200)  // statüs kontrolü
        ;

    }
}
