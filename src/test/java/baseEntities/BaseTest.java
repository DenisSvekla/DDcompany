package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.BrowsersService;
import core.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    BrowsersService browsersService;

    @BeforeMethod
    public void setUp() {

        browsersService = new BrowsersService();

    }

    @AfterMethod
    public void drop () {

        Selenide.closeWebDriver();

    }


}
