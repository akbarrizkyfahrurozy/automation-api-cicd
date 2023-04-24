package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set post api endpoints")
    public String iSetPostApiEndpoints() {
        return url + "posts";
    }

    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Akbar Rizky F");
        requestBody.put("kelas", "C");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPostApiEndpoints());
    }

    @Step("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        restAssuredThat(response -> response.body("'nama'", equalTo("Akbar Rizky F")));
        restAssuredThat(response -> response.body("'kelas'", equalTo("C")));
    }
}
