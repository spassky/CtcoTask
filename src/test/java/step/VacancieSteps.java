package step;

import infostructure.CucumberContext;
import infostructure.TestContext;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import page.VacanciePage;

public class VacancieSteps {
    private final VacanciePage vacanciePage = new VacanciePage(CucumberContext.getBrowser());
    private final TestContext testContext;

    public VacancieSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("Переходим к меню {string} и подменю {string}")
    public void iNavigate(String menuName, String subMenuName) {
        vacanciePage.goToVacancie(menuName, subMenuName);
    }

    @Given("Выбираем вакансию {string}")
    public void selectVacancie(String nameVacancie) {
        vacanciePage.selectVacancie(nameVacancie);
        testContext.setVacancieName(nameVacancie);
    }

    @Given("Количество умений в блоке {string} должно быть {int}")
    public void assertSkilsInBlock(String nameBlock, int skils) {
        int res = vacanciePage.getQuantSkilstVacancieInBlock(testContext.getVacancieName(), nameBlock);
        Assert.assertEquals(skils, res, "Количество полученных умений " + res + " не совпало с ожидаемым: " + skils);
    }

}

