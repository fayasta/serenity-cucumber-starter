package starter.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.pages.GooglePage;

public class GoogleSteps {

    GooglePage googlePage;

    @Step
    public void searchGoogle(String entry){
        googlePage.getInputField().sendKeys(entry);
        googlePage.getInputField().sendKeys(Keys.ENTER);
    }

    @Step
    public void openGoogle(){
        googlePage.open();
    }

}
