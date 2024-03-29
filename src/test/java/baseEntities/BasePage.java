package baseEntities;

import com.codeborne.selenide.Configuration;
import core.ReadProperties;

public abstract class BasePage {

    protected String BASE_URL;

    public BasePage() {
        this(false);
    }

    public BasePage(boolean openPageByUrl) {
        this.BASE_URL = Configuration.baseUrl = ReadProperties.getUrl();
        if (openPageByUrl) {
            openPage();
        }
    }

    protected abstract void openPage();

}
