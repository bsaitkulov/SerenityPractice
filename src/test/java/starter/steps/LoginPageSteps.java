package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.LoginPage;



public class LoginPageSteps {

    LoginPage loginPage;

    @Step
    public void goToPage(){
        loginPage.open();
    }
    @Step
    public void enterLogin(String input){
        loginPage.inputLogin(input);
    }
    @Step
    public void enterPassword(String input){
        loginPage.inputPassword(input);
    }
    @Step
    public void clickButton(){
        loginPage.clickLoginBtn();
    }
    public boolean landToWelcomePage(){
        loginPage.onWelcomePage();
        return true;
    }
}
