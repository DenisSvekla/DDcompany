package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import core.ReadProperties;
import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginRegistrationPage extends BasePage {

    private By EMAIL_FIELD_LOGIN = By.name("login");
    private By PASSWORD_FIELD_LOGIN = By.name("password");
    private By LOGIN_BUTTON = By.cssSelector("input[value='Авторизоваться']");




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



    public SelenideElement getEmailFieldLogin () {return $(EMAIL_FIELD_LOGIN);}
    public SelenideElement getPasswordFieldLogin () {return $(PASSWORD_FIELD_LOGIN);}
    public SelenideElement getLoginButton () {
        return $(LOGIN_BUTTON);
    }

    public SelenideElement getAnyNameCompany(String nameCompany) {
        return $(By.xpath("//*[@class='/companys/view/' and text()='"+ nameCompany + "']"));
    }

    public void loginUser(String email, String password) {
        getEmailFieldLogin().val(email);
        getPasswordFieldLogin().val(password);
        getLoginButton().click();
    }

}
