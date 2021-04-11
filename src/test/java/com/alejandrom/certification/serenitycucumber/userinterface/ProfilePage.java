package com.alejandrom.certification.serenitycucumber.userinterface;

import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import com.alejandrom.certification.serenitycucumber.utils.Utils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProfilePage extends PageObject {

    @FindBy(xpath = "//div[@class='qQD1kUtHq2K4gyBqJrEnF qQD1kUtHq2K4gyBqJrEnF ']//a")
    List<WebElementFacade> profilePostCategoriesButtons;

    PostsFeed postsFeed;


    public boolean searchPostInPostsCategories( int buttonIndexToSelect, String postTitleToFind) {

        buttonIndexToSelect = Utils.validateIndex(buttonIndexToSelect, 0, profilePostCategoriesButtons.size() - 1);
        profilePostCategoriesButtons.get(buttonIndexToSelect).waitUntilClickable().click();
        return postsFeed.findPostTitle(postTitleToFind);
    }
}
