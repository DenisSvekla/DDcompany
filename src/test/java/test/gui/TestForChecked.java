package test.gui;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import core.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import models.Company;
import models.Task;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CompaniesPage;
import page.LoginRegistrationPage;
import page.ProfilePage;
import steps.CompanySteps;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestForChecked extends BaseTest {
//    Company company;
//    Task user;
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
//        ProfilePage profilePage = new ProfilePage(true);
//        profilePage.getSelectFileButton().uploadFile(new File("src/test/resources/111.jpg"));
//        profilePage.getSaveButton().click();
//        profilePage.getSaveButton().shouldNotBe(Condition.visible);
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
//
//    }
}
