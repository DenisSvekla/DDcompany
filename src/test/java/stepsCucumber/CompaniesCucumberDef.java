package stepsCucumber;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import core.ReadProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Issue;
import io.qameta.allure.Step;
import models.Company;
import org.testng.Assert;
import page.AddCompanyPage;
import page.ChangeCompanyPage;
import page.CompaniesPage;
import page.LoginRegistrationPage;
import steps.CompanySteps;
import utils.Randomization;


public class CompaniesCucumberDef extends BaseTest {


    CompaniesPage companiesPage;
    Company company;


    @Step
    @Given("openBrowserAndLogin")
    public void openBrowserAndLogin() {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
        loginRegistrationPage.loginUser(ReadProperties.getEmail(), ReadProperties.getPassword());
    }

    @Step
    @When("openCompanyPage")
    public void openCompanyPage() {
        CompaniesPage companiesPage = new CompaniesPage(true);
        companiesPage.getAddCompanyButton().click();
    }

    @Step
    @And("createCompany")
    public void createCompany() {
        setUps();
        CompanySteps companySteps = new CompanySteps();
        companySteps.addCompany(company);
    }

    @Step
    @Then("onCompaniesPageDisplayCompany")
    public void onCompaniePpageDisplayCompany() {
        companiesPage = new CompaniesPage(false);
        companiesPage.getAnyNameCompany("Deniska").shouldBe(Condition.visible);
    }
    @Step
    @When("deleteCompany")
    public void deleteCompany() {
        companiesPage = new CompaniesPage(false);
        companiesPage.getDeleteCompanyButton().click();

    }
    @Step
    @Then("onCompaniesPageNotDisplayCompany")
    public void onCompaniesPageNotDisplayCompany() {
        setUps();
        companiesPage = new CompaniesPage(false);
        //Assert.assertTrue(false);
        companiesPage.getAnyNameCompany(company.getName()).shouldNotBe(Condition.visible);

    }
    @Step
    @When("open company and change name Company {string}")
    public void openCompanyAndChangeNameCompany(String nameCompany) {
        companiesPage = new CompaniesPage(true);
        companiesPage.getChangeCompanyButton().click();
        ChangeCompanyPage changeCompanyPage = new ChangeCompanyPage(false);
        changeCompanyPage.getNameCompanyField().clear();
        changeCompanyPage.getNameCompanyField().val(nameCompany);
        changeCompanyPage.getChangeCompanyBuild().click();

    }
    @Step
    @And("onTaskPage Successful Message is Displayed")
    public void onTaskPageSuccessfulMessageIsDisplayed() {
        companiesPage.getSuccesfullMessage().shouldBe(Condition.visible);

    }
    @Step
    @Then("nameCompany is {string}")
    public void nameCompanyIs(String name) {
        companiesPage.getAnyNameCompany(name).shouldBe(Condition.visible);
    }

    @Step
    @And("in field OGRN enter incorrect value")
    public void inFieldOGRNEnterIncorrectValue() {
        AddCompanyPage addCompanyPage = new AddCompanyPage(false);
        addCompanyPage.getNameCompanyField().val(Randomization.getRandomString(9));
        addCompanyPage.getOgrnField().val(Randomization.getRandomString(2));
        addCompanyPage.getAddCompanyButton().click();
    }

    @Step
    @Then("get an informational error message")
    public void getAnInformationalErrorMessage() {

       Assert.assertTrue(false);

    }

    public void setUps() {
        company = models.Company.builder()
                .name("Deniska")
                .INN("123456789012")
                .OGRN("1234567890123")
                .KPP(Randomization.getRandomString(9))
                .phone("123123")
                .address("dfredfrtgg123")
                .build();

    }


}
