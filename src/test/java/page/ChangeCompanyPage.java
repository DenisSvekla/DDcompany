package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChangeCompanyPage extends BasePage {

    private By NAME_COMPANY_FIELD = By.name("name");
    private By CHANGE_COMPANY_BUTTON = By.cssSelector("input[value='Редактировать компанию']");

    public ChangeCompanyPage() {
        super(false);
    }

    public ChangeCompanyPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        open(UIEndpoints.GET_CHANGE_COMPANY);

    }

    public SelenideElement getNameCompanyField () {return $(NAME_COMPANY_FIELD);}
    public SelenideElement getChangeCompanyBuild () {return $(CHANGE_COMPANY_BUTTON);}
}
