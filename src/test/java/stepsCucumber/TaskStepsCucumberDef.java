package stepsCucumber;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.AddTasksPage;
import page.ChangeTaskPage;
import page.ProfilePage;
import utils.Randomization;

public class TaskStepsCucumberDef extends BaseTest {
    ChangeTaskPage changeTaskPage;

    @Given("openTask")
    public void openTask() {

    }

    @And("changeNameTask on {string}")
    public void changeNameTaskOn(String nameTask) {
        Randomization.getRandomString(3);

    }
}
