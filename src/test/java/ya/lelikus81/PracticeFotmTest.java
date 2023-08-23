package ya.lelikus81;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFotmTest {
    @BeforeAll
    static void browserSize(){
        Configuration.startMaximized = true;
        Configuration.browser = "FIREFOX";
//        Configuration.browserSize = "1900x1240";
    }

    @Test
    void fillAllForm(){
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("123@123.io");
        $("[for=\"gender-radio-1\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();


        $(".react-datepicker__day").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#currentAddress").setValue("Address Taganrog");
        $("#submit").click();

        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
                .shouldHave(Condition.text("Alex Ivanov"));




    }
}
