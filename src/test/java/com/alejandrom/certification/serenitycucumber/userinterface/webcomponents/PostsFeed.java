package com.alejandrom.certification.serenitycucumber.userinterface.webcomponents;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static com.alejandrom.certification.serenitycucumber.utils.Utils.validateIndex;

public class PostsFeed extends PageObject {

    @FindBy(xpath = "//button[@class='_10K5i7NW6qcm-UoCtpB3aK YszYBnnIoNY8pZ6UwCivd _3yh2bniLq7bYr4BaiXowdO _2sAFaB0tx4Hd5KxVkdUcAx _28vEaVlLWeas1CDiLuTCap']")
    List<WebElementFacade> savePostButtons;

    @FindBy(xpath = "//h3[@class='_eYtD2XCVieq6emjKBH3m']")
    List<WebElementFacade> postsTitles;



    public String selectFeedPostSaveButton(int postIndexToSelect) {

        postIndexToSelect = validateIndex(postIndexToSelect, 0, savePostButtons.size() - 1);
        savePostButtons.get(postIndexToSelect).waitUntilClickable().click();
        return postsTitles.get(postIndexToSelect).waitUntilClickable().getText();

    }

    public boolean findPostTitle(String postTitleToFind) {

        for(WebElementFacade postTitle : postsTitles){

            if(postTitle.getText().equals(postTitleToFind))
                return true;
        }
        return false;
    }


}
