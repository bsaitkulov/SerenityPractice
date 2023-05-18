package starter.pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(name = "login")
    WebElement login;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//h2[contains(text(), 'Welcome back')]")
    WebElement welcomePage;




    public void inputLogin(String input){
        login.sendKeys(input);
    }
    public void inputPassword(String input){
        password.sendKeys(input);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
    public boolean onWelcomePage(){
        welcomePage.isDisplayed();
        return true;
    }

}

