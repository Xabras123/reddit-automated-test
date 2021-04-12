package com.alejandrom.certification.serenitycucumber.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SubredditPage extends PageObject {

    @FindBy(xpath = "//button[@class='_1LHxa-yaHJwrPK8kuyv_Y4 _2iuoyPiKHN3kfOoeIQalDT _10BQ7pjWbeYP63SAPNS8Ts HNozj_dKjQZ59ZsfEegz8 ']")
    WebElementFacade joinSubredditButton;

    @FindBy(xpath = "//button[@class='_1LHxa-yaHJwrPK8kuyv_Y4 _2iuoyPiKHN3kfOoeIQalDT _2tU8R9NTqhvBrhoNAXWWcP HNozj_dKjQZ59ZsfEegz8 ']")
    WebElementFacade leaveSubreddit;

    public void selectJoin() {

        joinSubredditButton.waitUntilClickable().click();

    }

    public void leaveSubreddit(){

        leaveSubreddit.waitUntilClickable().click();
    }


}
