package baseEntities;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.BrowsersService;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import steps.CompanySteps;

public class BaseTest {

    protected BrowsersService browsersService;
    protected CompanySteps companySteps;


}
