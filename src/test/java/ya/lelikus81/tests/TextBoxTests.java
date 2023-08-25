package ya.lelikus81.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "FIREFOX";
    }

    @Test
    void textBoxTest() {

        open("https://tenetx.io/login");
//        $("#userName").setValue("some name");
        $("[name = email]").setValue("alexey.ivanov.pro.1981@gmail.com");
        $("[name = password]").setValue("Test123456!");
//        $("#permanentAddress").setValue("other address");

//        $("#rc-anchor-container").click();
        $("[data-testid = submit-button]").click();

//        $("#output #name").shouldHave(text("some name"));
//        $("#output #email").shouldHave(text("123@123.io"));
//        $("#output #currentAddress").shouldHave(text("some address"));
//        $("#output #permanentAddress").shouldHave(text("other address"));
    }
}
