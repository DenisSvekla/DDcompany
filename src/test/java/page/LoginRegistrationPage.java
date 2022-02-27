package page;

import baseEntities.BasePage;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.open;

public class LoginRegistrationPage extends BasePage {


    public LoginRegistrationPage() {
        super(false);
    }

    public LoginRegistrationPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        open(UIEndpoints.GET_LOGIN_REGISTRATION);
    }


    @Override
    protected boolean isPageOpened() {
        return false;
    }
}
