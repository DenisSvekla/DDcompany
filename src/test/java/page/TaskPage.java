package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TaskPage extends BasePage {

    private By ADD_TASK_PAGE = By.cssSelector("a[href='tasks/add.html']");


    public TaskPage() {
        super(false);
    }

    public TaskPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {

        open(UIEndpoints.GET_GENERAL_PAGE_TASK);
    }

    public SelenideElement getAddTaskButton() {return $(ADD_TASK_PAGE);}

}
