package stepsCucumber;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import core.ReadProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Company;
import page.CompaniesPage;
import page.LoginRegistrationPage;
import steps.CompanySteps;


public class CompaniesCucumberDef extends BaseTest {


    CompaniesPage companiesPage;
    Company company;



    @Given("openBrowserAndLogin")
    public void openBrowserAndLogin() {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
        loginRegistrationPage.loginUser(ReadProperties.getEmail(), ReadProperties.getPassword());
    }

    @When("openCompanyPage")
    public void openCompanyPage() {
        CompaniesPage companiesPage = new CompaniesPage(true);
        companiesPage.getAddCompanyButton().click();
    }

    @And("createCompany")
    public void createCompany() {
        setUps();
        CompanySteps companySteps = new CompanySteps();
        companySteps.addCompany(company);
    }


    @Then("onCompaniesPageDisplayCompany")
    public void onCompaniePpageDisplayCompany() {
        companiesPage = new CompaniesPage(false);
        companiesPage.getAnyNameCompany("Deniska").shouldBe(Condition.visible);
    }

    @When("deleteCompany")
    public void deleteCompany() {
        companiesPage = new CompaniesPage(false);
        companiesPage.getDeleteCompanyButton().click();


    }

    @Then("onCompaniesPageNotDisplayCompany")
    public void onCompaniesPageNotDisplayCompany() {
        companiesPage.getAnyNameCompany(company.getName()).shouldNotBe(Condition.visible);
    }

    public void setUps () {
        company = models.Company.builder()
                .name("Deniska")
                .INN("123456789012")
                .OGRN("1234567890123")
                .KPP("asdfghfff")
                .phone("123123")
                .address("dfredfrtgg123")
                .build();

    }
}
