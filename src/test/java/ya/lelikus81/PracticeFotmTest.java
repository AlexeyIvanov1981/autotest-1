package ya.lelikus81;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFotmTest {
    @BeforeAll
    static void browserSize() {
        Configuration.startMaximized = true;
        Configuration.browser = "FIREFOX";
//        Configuration.browserSize = "1900x1240";
    }

    @Test
    void fillAllForm() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("123@123.io");
        $("genderWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();


        $(".react-datepicker__day").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#currentAddress").setValue("Address Taganrog");
        $("#submit").click();

        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
                .shouldHave(text("Alex Ivanov"));
        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
                .shouldHave(text("1234567890"));
        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(9) > td:nth-child(2)")
                .shouldHave(text("Address Taganrog"));
        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(2) > td:nth-child(2)")
                .shouldHave(text("123@123.io"));
        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(6) > td:nth-child(2)")
                .shouldHave(text("English"));
        $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(7) > td:nth-child(2)")
                .shouldHave(text("Music"));


//        open("https://demoqa.com/automation-practice-form");
//        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
//
//        $("#firstName").setValue("Alex");
//        $("#lastName").setValue("Egorov");
//        $("#userEmail").setValue("alex@egorov.com");
////        $("[for=gender-radio-1]").click();
//        $("#genterWrapper").$(byText("Male")).click();
//        $("#userNumber").setValue("1231231231");
//
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__month-select").selectOption("July");
//        $(".react-datepicker__year-select").selectOption("2008");
//        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
//        // react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month
//        // react-datepicker__day react-datepicker__day--030
//
////        $$(".react-datepicker__day--030")
////                .filter(not(cssClass("react-datepicker__day--outside-month"))).first().click();
////        $("[aria-label=\"Choose Monday, October 11th, 2021\"]").click();
////        $x("//*[contains(@aria-label, \"October 11th, 2021\")]").click();
//
//        $("#subjectsInput").setValue("Maths").pressEnter();
//        $("#hobbiesWrapper").$(byText("Sports")).click();
//
//        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
//        $("#uploadPicture").uploadFromClasspath("img/1.png");
//
//        $("#currentAddress").setValue("Some street 1");
//
//        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//        $("#city").click();
//        $("#stateCity-wrapper").$(byText("Noida")).scrollTo().click();
//
//
//        $("#submit").click();
//
//        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
//        $(".table-responsive").shouldHave(text("Alex Egorov"), text("alex@egorov.com"));
//        $(".table-responsive").$(byText("Student Name"))
//                .parent().shouldHave(text("Alex Egorov"));
//
//    }
//    }
    }
}
