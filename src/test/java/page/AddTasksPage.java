package page;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.UIEndpoints;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddTasksPage extends BasePage {

    private By NAME_TASK_FIELD = By.name("name");
    private By DESCRIPTION_TASK_PAGE = By.name("description");
    private By ADD_TASK_COMPANY = By.cssSelector(".btn-warning");

    public AddTasksPage() {
        super(false);
    }

    public AddTasksPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {

        open(UIEndpoints.GET_ADD_TASK);
    }

    public SelenideElement getNameTaskField() {
        return $(NAME_TASK_FIELD);
    }
    public SelenideElement getDescriptionTaskField() {
        return $(DESCRIPTION_TASK_PAGE);
    }
    public SelenideElement getAddTaskButton() {
        return $(ADD_TASK_COMPANY);
    }

}
