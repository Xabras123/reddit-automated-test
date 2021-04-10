package com.alejandrom.certification.serenitycucumber.steps;

import com.alejandrom.certification.serenitycucumber.userinterface.ProfilePage;
import com.alejandrom.certification.serenitycucumber.userinterface.RedditPage;
import com.alejandrom.certification.serenitycucumber.userinterface.SavePost;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import net.thucydides.core.annotations.Step;

public class Reddit {

    RedditPage redditPage;
    PostsFeed postsFeed;
    ProfilePage profilePage;

    @Step
    public void isTheHomePage(){
        redditPage.open();
    }

    @Step
    public void enterCredentials(String username, String password){
        redditPage.singInWithCredentials(username, password);
    }

    @Step
    public String savePost(int postIndexToSelect){
        return postsFeed.selectFeedPost(postIndexToSelect);
    }

    @Step
    public void enterProfile(){
        redditPage.enterProfile();

    }

    @Step
    public boolean checkSavedPost(int postCategoryIndexToSelect, String postTitle){
        return profilePage.searchPostInPostsCategories(postCategoryIndexToSelect, postTitle);
    }









}
