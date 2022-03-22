package page;

import baseEntities.BasePage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CompaniesPage extends BasePage {

    private By ADD_COMPANY_BUTTON = By.cssSelector(".btn-warning");
    private By DELETE_COMPANY_BUTTON = By.cssSelector("input[value='Удалить']");




    public CompaniesPage() {
        super(false);
    }

    public CompaniesPage(boolean openPageByUrl) {
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

    public SelenideElement getAddCompanyButton () { return $(ADD_COMPANY_BUTTON);}
    public SelenideElement getDeleteCompanyButton () { return $(DELETE_COMPANY_BUTTON);}

    public SelenideElement getAnyNameCompany(String nameCompany) {
        return $("//*[contains(@href, '/companys/view/') and text()='"+ nameCompany +"']");

        }
    public SelenideElement getDeleteCompanyButton (String nameCompany) {
        return $(By.xpath("//*[contains(@href, '/companys/view/') and text()='"+ nameCompany +"']//parent::ins/../../td/a[text()='Удалить']"));

        }

    }


