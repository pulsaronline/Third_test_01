import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Third_test_01 {

    @BeforeAll
    public static void setup() {
        //use Chrome browser, fullscreen

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @Test
    void selenideGitHubSearchTest() {
        //- Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //- Перейдите в раздел Wiki проекта
        $(byText("Wiki")).click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(text("Using JUnit5 extend test class:"));
        //sleep(5000);
    }
}