package page;

import com.codeborne.selenide.SelenideDriver;

public class LaunchPage extends PageObject {
    public LaunchPage(SelenideDriver browser) {
        super(browser);
    }

    public void navigate() {
        browser.open("/");
    }

    public void closeBrowser(){
        browser.close();
    }

}
