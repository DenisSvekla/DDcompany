package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UIEndpoints;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilePage extends BasePage {

    private By SELECT_FILE_BUTTON = By.name("avatar");
    private By SAVE_BUTTON = By.name("act_profile_now");

    public ProfilePage() {
        super(false);
    }

    public ProfilePage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {

        open(UIEndpoints.GET_PROFILE_USER);
    }

    @Override
    protected boolean isPageOpened() {
        return false;
    }

    public SelenideElement getSelectFileButton() {
        return $(SELECT_FILE_BUTTON);
    }
    public SelenideElement getSaveButton() {
        return $(SAVE_BUTTON);
    }
}
