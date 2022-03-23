package stepsCucumber;

import baseEntities.BaseTest;
import core.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.LoginRegistrationPage;
import page.ProfilePage;

import java.io.File;

public class ProfileStepsCucumberDef extends BaseTest {

    ProfilePage profilePage;

    @Given("openBrowserAndLogins")
    public void openBrowserAndLogin() {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
        loginRegistrationPage.loginUser(ReadProperties.getEmail(), ReadProperties.getPassword());
    }

    @Given("openProfile")
    public void openProfile() {
        profilePage = new ProfilePage(true);

    }

    @When("selectFileinFormAndClickSaveButton")
    public void selectfileinformandclicksavebutton() {
        profilePage.getSelectFileButton().uploadFile(new File("src/test/resources/111.jpg"));
        profilePage.getSaveButton().click();
    }
}
