package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideDriver;

import static com.codeborne.selenide.Condition.and;

public abstract class PageObject {
    protected final SelenideDriver browser;
    protected final Condition clickable = and("can be clicked", Condition.visible, Condition.enabled);

    protected PageObject(SelenideDriver browser) {
        this.browser = browser;
    }
}
