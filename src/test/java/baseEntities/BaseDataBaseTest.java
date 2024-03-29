package baseEntities;

import core.DataBaseService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseDataBaseTest {

    protected DataBaseService dataBaseService;

    @BeforeTest
    public void setupConnection() {
        org.apache.log4j.BasicConfigurator.configure();
        dataBaseService = new DataBaseService();
    }

    @AfterTest
    public void closeConnection() {
        dataBaseService.closeConnection();
    }
}
