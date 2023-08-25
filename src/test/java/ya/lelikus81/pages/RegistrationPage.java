package ya.lelikus81.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String URL = "https://demoqa.com/automation-practice-form";

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            resultTable = $(".table-responsive"),
            submitButton = $("#submit");


    public void openPage(String url) {
        open(url);
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void typeEmail(String value) {
        emailInput.setValue(value);
    }

    public RegistrationPage checkResultValue(String key, String value) {
        resultTable.$(byText(key)).parent().shouldHave(text(value));
        return this;

    }

    public void clickSubmitButton(){
        submitButton.click();
    }

}
