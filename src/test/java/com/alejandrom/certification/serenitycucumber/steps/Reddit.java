package com.alejandrom.certification.serenitycucumber.steps;

import com.alejandrom.certification.serenitycucumber.userinterface.ProfilePage;
import com.alejandrom.certification.serenitycucumber.userinterface.RedditPage;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import net.thucydides.core.annotations.Step;

public class Reddit {

    RedditPage redditPage;
    PostsFeed postsFeed;
    ProfilePage profilePage;

    @Step("Abrir el navegador en la pagina de login de reddit")
    public void isTheHomePage(){
        redditPage.open();
    }

    @Step("Ingresar credenciales para hacer un login correcto")
    public void enterCredentials(String username, String password){
        redditPage.singInWithCredentials(username, password);
    }

    @Step("Guardar el primer post visible en el feed de la pagina principal")
    public String clickSavePostButton(int postIndexToSelect){
        return postsFeed.selectFeedPostSaveButton(postIndexToSelect);
    }

    @Step("Ingresar el perfil de usuario")
    public void enterProfile(){
        redditPage.enterProfile();

    }

    @Step("Revisar que el post guardado se encuentre efectivamente en el perfil de usuario, en la zona de guardados")
    public boolean checkSavedPost(int postCategoryIndexToSelect, String postTitle){
        return profilePage.searchPostInPostsCategories(postCategoryIndexToSelect, postTitle);
    }









}
