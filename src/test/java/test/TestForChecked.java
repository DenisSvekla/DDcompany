package test;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.LoginRegistrationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForChecked extends BaseTest {

    @Test
    public void test() {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(true);
        $(By.name("login")).shouldBe(Condition.visible);
    }
}
