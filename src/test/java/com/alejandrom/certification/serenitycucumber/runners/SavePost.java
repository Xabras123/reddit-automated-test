package com.alejandrom.certification.serenitycucumber.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/save_post.feature",
        glue = "com.alejandrom.certification.serenitycucumber.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class SavePost {
}
