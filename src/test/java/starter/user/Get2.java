package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get2 {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET url posts")
    public String iSetGETUrlPosts() {
        return url + "posts/1";
    }

    @Step("I send get HTTP request")
    public void iSendGetHTTPRequest() {
        SerenityRest.given().get(iSetGETUrlPosts());
    }

    @Step("I receive valid data for detail user")
    public void iReceiveValidDataForDetailUser() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
