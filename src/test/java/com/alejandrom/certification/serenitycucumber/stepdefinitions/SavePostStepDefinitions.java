package com.alejandrom.certification.serenitycucumber.stepdefinitions;

import com.alejandrom.certification.serenitycucumber.steps.Reddit;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.assertTrue;

public class SavePostStepDefinitions {



    @Steps
    Reddit redditPage;

    String postTitle;

    @Given("^that Accenture testing enters with (.*) and (.*)$")
    public void thatAccentureTestingEntersWithCorreoPruebasTestingGmailComAndCorreoPruebasTesting_(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        redditPage.isTheHomePage();
        redditPage.enterCredentials(arg1, arg2);

    }


    @When("^user wants to save the post number (\\d+) from the home page$")
    public void userWantsToSaveThePostNumberFromTheHomePage(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        postTitle = redditPage.clickSavePostButton(0);

    }

    @Then("^user expect for it to be saved on its saved post section$")
    public void userExpectForItToBeSavedOnItsSavedPostSection() {
        // Write code here that turns the phrase above into concrete actions
        boolean postIsSaved = false;
        redditPage.enterProfile();
        postIsSaved = redditPage.checkSavedPost(3, postTitle);
        redditPage.clickSavePostButton(0);
        assertTrue(postIsSaved);

    }

}
