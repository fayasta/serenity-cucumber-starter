package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    private WebElementFacade inputField;


    public WebElementFacade getInputField() {
        return inputField;
    }

}
