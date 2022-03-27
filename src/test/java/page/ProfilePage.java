package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilePage extends BasePage {

    private By SELECT_FILE_BUTTON = By.name("avatar");
    private By SAVE_BUTTON = By.name("act_profile_now");
    private By EMAIL_BUTTON = By.xpath("//a[text()='llolloibibrippa-6119@yopmail.com']");
    private By DEFAULT_IMAGE = By.cssSelector("img[src='/tmp/default_avatar.jpg']");

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

    public SelenideElement getSelectFileButton() {
        return $(SELECT_FILE_BUTTON);
    }
    public SelenideElement getSaveButton() {
        return $(SAVE_BUTTON);
    }
    public SelenideElement getEmailButton() {return $(EMAIL_BUTTON);}
    public SelenideElement getDefaultImg() {return $(DEFAULT_IMAGE);}
}
