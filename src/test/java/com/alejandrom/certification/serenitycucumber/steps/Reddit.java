package com.alejandrom.certification.serenitycucumber.steps;

import com.alejandrom.certification.serenitycucumber.userinterface.ProfilePage;
import com.alejandrom.certification.serenitycucumber.userinterface.RedditPage;
import com.alejandrom.certification.serenitycucumber.userinterface.SubredditPage;
import com.alejandrom.certification.serenitycucumber.userinterface.webcomponents.PostsFeed;
import net.thucydides.core.annotations.Step;

public class Reddit {

    private RedditPage redditPage;
    private ProfilePage profilePage;
    private SubredditPage subredditPage;
    private PostsFeed postsFeed;

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


    @Step("Buscar un keyword especifico en la barra buscadora de reddit")
    public void searchElement(String stringTosearch){

        redditPage.searchAndSelectItem(stringTosearch);
    }

    @Step("Se une a un subreddit ya abierto en el navegador")
    public void joinSubreddit(){

        subredditPage.selectJoin();
    }

    @Step("Valida que se haya unido a un subreddit")
    public boolean checkIfJoined(String subredditToCheck){

        return redditPage.checkIfSubredditIsJoined(subredditToCheck);
    }

    @Step("Se sale de un subreddit ya abierto en el navegador")
    public void leaveSubreddit(){

        subredditPage.leaveSubreddit();
    }

    @Step("Se refresca la pagina en la que se encuentre")
    public void refreshCurrentPage(){

        redditPage.refreshCurrentPage();
    }



}
