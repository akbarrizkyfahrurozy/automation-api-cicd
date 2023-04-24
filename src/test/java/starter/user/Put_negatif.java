package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Put_negatif {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT api endpointss")
    public String iSetPUTApiEndpointss() {
        return url + "posts/10000000";
    }

    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Akbar Rizky F");
        requestBody.put("kelas", "C");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPUTApiEndpointss());
    }

    @Step("I receive invalid HTTP response code 500")
    public void iReceiveInvalidHTTPResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }

}
