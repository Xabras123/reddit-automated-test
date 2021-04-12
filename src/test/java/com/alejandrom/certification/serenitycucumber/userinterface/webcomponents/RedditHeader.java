package com.alejandrom.certification.serenitycucumber.userinterface.webcomponents;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RedditHeader extends PageObject {

    @FindBy(xpath = "//button[@id='USER_DROPDOWN_ID']")
    WebElementFacade userOptionsDropdown;

    @FindBy(xpath = "//a[@class='_1YWXCINvcuU7nk0ED-bta8']")
    WebElementFacade profileButton;

    @FindBy(xpath = "//input[@id='header-search-bar']")
    WebElementFacade searchBarInput;

    @FindBy(xpath = "//div[@class='_17mZueOafzj0Dlja0Wc9os _3NseKdP3_1HONmKk_kK3_l _2aqH0n-kSzFY7HZZ5GL-Jb']")
    List<WebElementFacade> serachSugestions;

    @FindBy(xpath = "//a[@class='_1YWXCINvcuU7nk0ED-bta8']")
    List<WebElementFacade> userCominitiesButtons;

    @FindBy(xpath = "//span[@class='_2aqH0n-kSzFY7HZZ5GL-Jb']")
    List<WebElementFacade> myComunitiesSpansList;

    @FindBy(xpath = "//button[@class='h-jI8r2f9ozTNqu_2TBeY']")
    WebElementFacade postsFilterButton;

    public void enterProfile(){

        userOptionsDropdown.waitUntilClickable().click();
        profileButton.waitUntilClickable().click();

    }


    public boolean searchAndSelectItem(String stringTosearch) {

        boolean itemFound = false;
        int indexOfItemToSelect = 0;
        int i = 0;
        searchBarInput.waitUntilClickable().sendKeys(stringTosearch);
        searchBarInput.waitUntilClickable().click();

        for(WebElementFacade sugestedItem : serachSugestions) {
            if (!sugestedItem.waitUntilClickable().getText().equals(stringTosearch)) {
                indexOfItemToSelect = i;
                itemFound = true;
                break;
            }
            i++;
        }

        serachSugestions.get(indexOfItemToSelect).waitUntilVisible().click();
        return itemFound;

    }

    public void clickPostsFilterButton(){

        postsFilterButton.waitUntilClickable().click();
    }

    public boolean checkIfSubredditIsJoined(String subredditName){

        for(WebElementFacade joinedSubreddir : myComunitiesSpansList){
            if(joinedSubreddir.waitUntilClickable().getText().equals(subredditName)){
                return true;
            }
        }
        return false;

    }
}
