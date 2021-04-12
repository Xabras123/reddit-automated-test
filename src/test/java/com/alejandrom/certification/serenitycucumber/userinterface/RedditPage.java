package com.alejandrom.certification.serenitycucumber.userinterface;


import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.Login;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.RedditHeader;
import com.alejandrom.certification.serenitycucumber.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F")
public class RedditPage extends PageObject{

    private Login loginComponent;
    private RedditHeader redditHeader;
    private PostsFeed postsFeedComponent;




    public void singInWithCredentials(String username, String password) {

        this.loginComponent.singInWithCredentials(username, password);
    }


    public void selectPostFromMainFeedback(int indexToSelect){

        postsFeedComponent.selectFeedPostSaveButton(indexToSelect);
    }

    public void enterProfile(){

        redditHeader.enterProfile();
    }

    public boolean searchAndSelectItem(String stringTosearch){

        return redditHeader.searchAndSelectItem(stringTosearch);
    }

    public boolean checkIfSubredditIsJoined(String subredditName){

        redditHeader.clickPostsFilterButton();
        return redditHeader.checkIfSubredditIsJoined(subredditName);
    }


    public void refreshCurrentPage() {
        getDriver().navigate().refresh();
    }
}
