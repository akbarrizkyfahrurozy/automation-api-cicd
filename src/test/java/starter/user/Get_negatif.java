package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get_negatif {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET url postss")
    public String iSetGETUrlPostss() {
        return url + "posts/lima";
    }

    @Step("I send get HTTP requests")
    public void iSendGetHTTPRequests() {
        SerenityRest.given().get(iSetGETUrlPostss());
    }

    @Step("I receive blank HTTP response code 404")
    public void iReceiveBlankHTTPResponseDetailUser() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
