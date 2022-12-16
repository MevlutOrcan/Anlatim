package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class AmazonStepDefinitions {

    @Given("User goes to {string}")
    public void userGoesTo(String arg0) {
        System.out.println("aklsdn");
        System.out.println("ikinci islem");
        System.out.println("ikinci islemin devami");
        System.out.println("yenisurum");
    }

    @Then("User verify Amazon URL is {string}")
    public void userVerifyAmazonURLIs(String arg0) {

    }

    @And("User verify to title contains {string}")
    public void userVerifyToTitleContains(String arg0) {

    }
}
