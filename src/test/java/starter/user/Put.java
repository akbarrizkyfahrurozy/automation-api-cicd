package starter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Put {

    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT api endpoints")
    public String iSetPUTApiEndpoints() {
        return url + "posts/1";
    }

    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Akbar Rizky F");
        requestBody.put("kelas", "C");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPUTApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for updated user")
    public void iReceiveValidDataForUpdatedUser() {
        restAssuredThat(response -> response.body("'nama'", equalTo("Akbar Rizky F")));
        restAssuredThat(response -> response.body("'kelas'", equalTo("C")));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
    }
}
