package com.alejandrom.certification.serenitycucumber.userinterface.webcomponents;

import com.alejandrom.certification.serenitycucumber.userinterface.RedditPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F")
public class Login extends PageObject {

    //@FindBy(xpath = "//a[@class='_3Wg53T10KuuPmyWOMWsY2F _2iuoyPiKHN3kfOoeIQalDT _2tU8R9NTqhvBrhoNAXWWcP HNozj_dKjQZ59ZsfEegz8 _2nelDm85zKKmuD94NequP0']")
    //private WebElementFacade loginButton;

    @FindBy(xpath = "//input[@id='loginUsername']")
    private WebElementFacade usernameForLoginInput;

    @FindBy(xpath = "//input[@id='loginPassword']")
    private WebElementFacade passwordForLoginInput;



    public void singInWithCredentials(String username, String password) {

        //this.loginButton.waitUntilClickable().click();

        this.usernameForLoginInput.waitUntilClickable().sendKeys(username);
        this.passwordForLoginInput.waitUntilClickable().typeAndEnter(password);

    }

}
