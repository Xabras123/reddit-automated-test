package com.alejandrom.certification.serenitycucumber.userinterface;


import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.Login;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F")
public class RedditPage extends PageObject{

    private Login loginComponent;
    private PostsFeed postsFeedComponent;

    @FindBy(xpath = "//button[@id='USER_DROPDOWN_ID']")
    WebElementFacade userOptionsDropdown;

    @FindBy(xpath = "//a[@class='_1YWXCINvcuU7nk0ED-bta8']")
    WebElementFacade profileButton;

    public void singInWithCredentials(String username, String password){

        this.loginComponent.singInWithCredentials(username, password);

    }
    public void selectPostFromMainFeedback(int indexToSelect){

        postsFeedComponent.selectFeedPostSaveButton(indexToSelect);
    }

    public void enterProfile(){

        userOptionsDropdown.waitUntilClickable().click();
        profileButton.waitUntilClickable().click();

    }






}
