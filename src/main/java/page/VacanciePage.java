package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideDriver;
import org.openqa.selenium.By;

public class VacanciePage extends PageObject {

    public VacanciePage(SelenideDriver browser) {
        super(browser);
    }

    public void goToVacancie(String menuName, String subMenuName) {
        //browser.$(By.id("menu-item-127")).hover();
        browser.$(By.xpath(String.format("//*[@role='navigation']//*[contains(@id, 'menu-item-')]//*[text()='%s']", menuName))).shouldBe(clickable).hover();
        //browser.$(By.id("menu-item-131")).shouldBe(clickable).click();
        browser.$(By.xpath(String.format("//*[@role='navigation']//*[@class='sub-menu']//*[contains(@id, 'menu-item-')]//*[text()='%s']", subMenuName))).shouldBe(clickable).click();
    }

    public void selectVacancie(String nameVacancie) {
        browser.$(By.xpath(String.format("//*[@class='menu-main-container']//*[contains(@id, 'menu-main-')]//*[text()='%s']", nameVacancie))).shouldBe(clickable).click();
        browser.$(By.xpath(String.format("//div[@class='text-block']/h1[text()='%s']", nameVacancie))).should(Condition.visible);
    }

    public int getQuantSkilstVacancieInBlock(String nameVacancie, String nameBlock) {
        return browser.$$(By.xpath(String.format("//div[@class='text-block']/h1[text()='%s']/..//*[text()='%s']/../../ul[1]/li", nameVacancie, nameBlock))).size();
    }
}
