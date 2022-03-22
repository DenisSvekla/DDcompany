package page;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.open;

public class AddComanyPage extends BasePage {

    public AddComanyPage() {
        super(false);
    }

    public AddComanyPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        open(UIEndpoints.GET_ADD_COMPANY);

    }

    @Override
    protected boolean isPageOpened() {
        return false;
    }
}
