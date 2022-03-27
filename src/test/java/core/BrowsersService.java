package core;

import com.codeborne.selenide.Configuration;


public class BrowsersService {

    protected static final String url = ReadProperties.getUrl();

    public BrowsersService() {
        this(ReadProperties.getBrowserName());
    }

    public BrowsersService(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                Configuration.baseUrl = url;
                Configuration.browser = "chrome";
                Configuration.fastSetValue = true;
                Configuration.headless = false;
                Configuration.timeout = 8000;
                Configuration.reportsFolder = "target/allure-results";
                break;

            case "firefox":

                break;

            default:
                System.out.println("Browser " + browserName + " is not supported.");
                break;
        }

    }

}
