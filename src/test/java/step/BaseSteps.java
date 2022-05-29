package step;

import infostructure.CucumberContext;
import page.LaunchPage;

public class BaseSteps {
    private final LaunchPage launchPage = new LaunchPage(CucumberContext.getBrowser());

    public void launchBrowser(){
        launchPage.navigate();

    }
    public void closeBrowser(){
        launchPage.closeBrowser();
    }

}
