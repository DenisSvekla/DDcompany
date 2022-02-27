package page;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.open;

public class CompanyPage extends BasePage {

    public CompanyPage() {
        super(false);
    }

    public CompanyPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        open(UIEndpoints.GET_ALL_COMPANY);

    }

    @Override
    protected boolean isPageOpened() {
        return false;
    }
}
