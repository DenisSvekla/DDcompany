package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddCompanyPage extends BasePage {

    private By NAME_COMPANY_FIELD = By.name("name");
    private static String TYPE_COMPANY = "type";
    private By INN_FIELD = By.name("inn");
    private By OGRN_FIELD = By.name("ogrn");
    private By KPP_FIELD = By.name("kpp");
    private By PHONE_FIELD = By.name("phone");
    private By ADDRESS_FIELD = By.name("adress");
    private By ADD_COMPANY_BUTTOn = By.cssSelector("input[value='Добавить компанию']");


    public AddCompanyPage() {
        super(false);
    }

    public AddCompanyPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        open(UIEndpoints.GET_ADD_COMPANY);
    }

    public SelenideElement getNameCompanyField() {return $(NAME_COMPANY_FIELD);}
    public SelenideElement getTypeCompanyField() {return $(TYPE_COMPANY);}
    public SelenideElement getInnField() {return $(INN_FIELD);}
    public SelenideElement getOgrnField() {return $(OGRN_FIELD);}
    public SelenideElement getKppField() {return $(KPP_FIELD);}
    public SelenideElement getPhoneField() {return $(PHONE_FIELD);}
    public SelenideElement getAddressField() {return $(ADDRESS_FIELD);}
    public SelenideElement getAddCompanyButton() {return $(ADD_COMPANY_BUTTOn);}

}
