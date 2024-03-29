package stepsCucumber;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import core.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import page.LoginRegistrationPage;
import page.ProfilePage;

import java.io.File;

public class ProfileStepsCucumberDef extends BaseTest {

    ProfilePage profilePage;

    @Step
    @Given("openBrowserAndLogins")
    public void openBrowserAndLogin() {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
        loginRegistrationPage.loginUser(ReadProperties.getEmail(), ReadProperties.getPassword());
    }

    @Step
    @Given("openProfile")
    public void openProfile() {
        profilePage = new ProfilePage(true);

    }
    @Step
    @When("selectFileinFormAndClickSaveButton")
    public void selectfileinformandclicksavebutton() {
        profilePage.getSelectFileButton().uploadFile(new File("src/test/resources/111.jpg"));
        profilePage.getSaveButton().click();
    }
    @Step
    @Then("newFileUploaded")
    public void newFileUploaded() {
        profilePage.getEmailButton().click();
        profilePage.getDefaultImg().shouldNotBe(Condition.visible);

    }
}
