package page;

import baseEntities.BasePage;


import static com.codeborne.selenide.Selenide.open;

public class LoginRegistrationPage extends BasePage {

    private static String ENDPOINT = "/user/login/index.html";


    public LoginRegistrationPage() {
        super(false);
    }

    public LoginRegistrationPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() { open(ENDPOINT);}



    @Override
    protected boolean isPageOpened() {
        return false;
    }
}
