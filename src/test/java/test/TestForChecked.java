package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForChecked extends BaseTest {

    @Test
    public void test() {
        open("/");
        $(By.xpath("//*[text()='Вти']")).click();
    }
}
