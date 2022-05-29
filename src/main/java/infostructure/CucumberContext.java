package infostructure;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;

public class CucumberContext {

    private static SelenideDriver browser;

    public static SelenideDriver getBrowser() {
        if (browser == null) {
            browser = new SelenideDriver(new SelenideConfig()
                    .browserSize("1366x895")
                    .baseUrl("https://ctco.lv/en"));
        }
        return browser;
    }

}