package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private final BaseSteps baseSteps;

    public Hooks(BaseSteps baseSteps) {
        this.baseSteps = baseSteps;
    }

    @Before
    public void launchChrome() {
        baseSteps.launchBrowser();
    }

    @After
    public void tearDownChrome() {
        baseSteps.closeBrowser();
    }

}
