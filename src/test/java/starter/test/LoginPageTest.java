package starter.test;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.ConfigReader;
import starter.steps.LoginPageSteps;


@ExtendWith(SerenityJUnit5Extension.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps steps;

    @Test
    public void testLoginPage(){
        steps.goToPage();
        steps.enterLogin(ConfigReader.getProperty("login"));
        steps.enterPassword(ConfigReader.getProperty("password"));
        steps.clickButton();
        Assertions.assertTrue(steps.landToWelcomePage(), "User is on HomePage");

    }
}
