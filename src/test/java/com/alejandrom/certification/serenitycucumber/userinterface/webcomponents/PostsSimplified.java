package com.alejandrom.certification.serenitycucumber.userinterface.webcomponents;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PostsSimplified extends PageObject {

    @FindBy(xpath = "//h3[@class='_eYtD2XCVieq6emjKBH3m']")
    List<WebElementFacade> postsTitles;

    public boolean findPostTitle(String postTitleToFind) {

        System.out.println("adasdasdasd   " + postTitleToFind);
        for(WebElementFacade postTitle : postsTitles){

            System.out.println("evaluation " +postTitle.getText() +" "+ postTitleToFind);

            if(postTitle.getText().equals(postTitleToFind))
                return true;
        }
        return false;

    }




}
