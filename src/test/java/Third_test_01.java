import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Third_test_01 {

    @BeforeAll
    public static void setup() {
        //use Chrome browser, fullscreen

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @Test
    void selenideSearchTest() {

        //- Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //- Перейдите в раздел Wiki проекта
        $(byText("Wiki")).click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

        //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5


    }
}