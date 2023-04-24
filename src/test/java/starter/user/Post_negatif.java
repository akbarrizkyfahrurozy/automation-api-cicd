package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post_negatif {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set post api endpoints")
    public String iSetPostApiEndpoints() {
        return url + "posts";
    }
    @Step("I send POST HTTP requestt")
    public void iSendPOSTHTTPRequestt() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Akbar Rizky F");
        requestBody.put("kelas", "C");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPostApiEndpoints());
    }
    @Step("I receive invalid data for new user")
    public void iReceiveInalidDataForNewUser() {
        restAssuredThat(response -> response.body("'nama'", equalTo("Akbar Rizky F")));
        restAssuredThat(response -> response.body("'kelas'", equalTo("A")));
    }
}
