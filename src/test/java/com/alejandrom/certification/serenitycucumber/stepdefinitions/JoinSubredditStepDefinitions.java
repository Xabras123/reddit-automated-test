package com.alejandrom.certification.serenitycucumber.stepdefinitions;

import com.alejandrom.certification.serenitycucumber.steps.Reddit;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class JoinSubredditStepDefinitions {

    @Steps
    Reddit redditPage;

    private String subredditName;


    @When("^user wants to join a subreddit named (.*)$")
    public void userWantsToJoinASubredditNamedRJava(String arg1) {
        subredditName = arg1;
        redditPage.searchElement(arg1);
        redditPage.joinSubreddit();
    }


    @Then("^user expect for the 'My Communities' section to have the new (.*) item$")
    public void userExpectForTheSectionToHaveTheNewRJavaItem(String arg1) {

        boolean success = false;
        subredditName = arg1;

        redditPage.refreshCurrentPage();
        success = redditPage.checkIfJoined(arg1);
        assertTrue(success);
    }

    @After
    public void tearDown() {

        redditPage.refreshCurrentPage();
        if(redditPage.checkIfJoined(subredditName)){
            //redditPage.searchElement(subredditName);
            redditPage.leaveSubreddit();
        }

    }
}
