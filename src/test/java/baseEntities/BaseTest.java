package baseEntities;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.BrowsersService;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import steps.CompanySteps;

public class BaseTest {

    protected BrowsersService browsersService;
    protected CompanySteps companySteps;

    @BeforeClass
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
        .screenshots(true)
        .savePageSource(true));

        browsersService = new BrowsersService();
        companySteps = new CompanySteps();

    }

    @AfterTest
    public void drop() {

        Selenide.closeWebDriver();

    }


}
