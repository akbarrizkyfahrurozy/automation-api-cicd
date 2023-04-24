package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Get2 get2;
    @Steps
    Put put;
    @Steps
    Delete delete;
    @Given("I set GET url posts")
    public void iSetGETUrlPosts() {
        get.iSetGETUrlPosts();
    }

    @When("I send get HTTP request")
    public void iSendGetHTTPRequest() {
        get.iSendGetHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        get.iReceiveValidHTTPResponseCode();
    }

    @And("I receive valid data for detail user")
    public void iReceiveValidDataForDetailUser() {
        get2.iReceiveValidDataForDetailUser();
    }
    @Given("I set post api endpoints")
    public void iSetPostApiEndpoints() {
        post.iSetPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.iSendPOSTHTTPRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode201() {
        post.iReceiveValidHTTPResponseCode201();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        post.iReceiveValidDataForNewUser();
    }
    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        put.iSetPUTApiEndpoints();
    }
    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        put.iSendPUTHTTPRequest();
    }

    @And("I receive valid data for updated user")
    public void iReceiveValidDataForUpdatedUser() {
        put.iReceiveValidDataForUpdatedUser();
    }
    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delete.iSetDELETEApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delete.iSendDELETEHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200 delete")
    public void iReceiveValidHTTPResponseCode200Delete() {
        delete.iReceiveValidHTTPResponseCode200Delete();
    }
}
