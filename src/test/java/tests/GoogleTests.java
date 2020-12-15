package tests;

import com.codeborne.selenide.Condition;
import config.ConfigHelper;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    void selenideSearchTest() {

        String searchUrl = ConfigHelper.getSearchUrl();
        String searchItem = ConfigHelper.getSearchItem();
        String searchResult = ConfigHelper.getSearchResult();

        open(searchUrl);

        $(byName("q")).setValue(searchItem).pressEnter();

        $("html").shouldHave(Condition.text(searchResult));
    }
}
