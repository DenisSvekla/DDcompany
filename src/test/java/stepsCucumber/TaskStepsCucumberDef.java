package stepsCucumber;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.Randomization;

public class TaskStepsCucumberDef extends BaseTest {


    @Given("openTask")
    public void openTask() {


    }

    @And("changeNameTask on {string}")
    public void changeNameTaskOn(String nameTask) {
        Randomization.getRandomString(3);

    }
}
