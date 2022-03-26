package test.gui;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import core.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import models.Company;
import models.Task;
import models.TaskB;
import org.testng.annotations.Test;
import page.*;
import steps.CompanySteps;

import java.io.File;

public class TestForChecked extends BaseTest {
//    Company company;
//    TaskB user;
//    Task task;
//
//
//    @Test
//    @Issue("1-bag-1")
//    @Description("asdsada")
//    public void test() {
//        setUps();
//        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
//        loginRegistrationPage.getEmailFieldLogin().val(ReadProperties.getEmail());
//        loginRegistrationPage.getPasswordFieldLogin().val(ReadProperties.getPassword());
//        loginRegistrationPage.getLoginButton().click();
//        CompaniesPage companiesPage = new CompaniesPage(true);
//        companiesPage.getAddCompanyButton().click();
//        CompanySteps companySteps = new CompanySteps();
//        companySteps.addCompany(company);
//        companySteps.deleteCompany(company);
//        companiesPage.getAnyNameCompany(company.getName()).shouldNotBe(Condition.visible);
//        ProfilePage profilePage = new ProfilePage(true);
//        profilePage.getSelectFileButton().uploadFile(new File("src/test/resources/111.jpg"));
//        profilePage.getSaveButton().click();
//
//
//
//    }
//
//    public void setUps () {
//      //  $("input#fileupload").uploadFile(new File("src\\test\\resources\\files\\smile.png"));
//        // $("input#fileupload").uploadFile(new File("src\\test\\resources\\files\\smile.png"));
//        company = Company.builder()
//                .name("ыфвdasdфыв")
//                .INN("123456789012")
//                .OGRN("1234567890123")
//                .KPP("asdfghfff")
//                .phone("123123")
//                .address("dfredfrtgg123")
//                .build();
//        task = Task.builder()
//                .nameTask("ddd")
//                .descriptionTask("asdad")
//                .build();
//
//    }
}
