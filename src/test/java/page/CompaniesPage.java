package page;

import baseEntities.BasePage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CompaniesPage extends BasePage {

    private By ADD_COMPANY_BUTTON = By.cssSelector(".btn-warning");
    private By DELETE_COMPANY_BUTTOdN = By.xpath("(//*[@class = 'btn btn-danger'])[2]");
    private By CHANGE_COMPANY_BUTTOD = By.xpath("(//*[@class = 'btn btn-danger'])[1]");
    private By SUCCESFULL_MESSAGE = By.cssSelector("div[class='alert in fade alert-success']");





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



    public SelenideElement getAddCompanyButton () { return $(ADD_COMPANY_BUTTON);}
    public SelenideElement getDeleteCompanyButton () { return $(DELETE_COMPANY_BUTTOdN);}
    public SelenideElement getChangeCompanyButton () { return $(CHANGE_COMPANY_BUTTOD);}
    public SelenideElement getSuccesfullMessage () { return $(SUCCESFULL_MESSAGE);}

    public SelenideElement getAnyNameCompany(String nameCompany) {
        return $(By.xpath("//*[contains(@href, '/companys/view/') and text()='"+ nameCompany +"']"));

        }
    public SelenideElement getDeleteCompanyButton (String nameCompany) {
        return $(By.xpath("//*[contains(@href, '/companys/view/') and text()='"+ nameCompany +"']//parent::ins/../../td/a[text()='Удалить']"));

        }

    }


