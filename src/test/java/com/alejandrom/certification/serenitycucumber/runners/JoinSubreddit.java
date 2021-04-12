package com.alejandrom.certification.serenitycucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/join_subreddit.feature",
        glue = "com.alejandrom.certification.serenitycucumber.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class JoinSubreddit {


}
