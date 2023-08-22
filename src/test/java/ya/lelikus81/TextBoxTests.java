package ya.lelikus81;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void textBoxTest() {

        open("https://demoqa.com/text-box");
        $("#userName").setValue("some name");
        $("#userEmail").setValue("123@123.io");
        $("#currentAddress").setValue("some address");
        $("#permanentAddress").setValue("other address");

        $("#submit").click();

        $("#output #name").shouldHave(text("some name"));
        $("#output #email").shouldHave(text("123@123.io"));
        $("#output #currentAddress").shouldHave(text("some address"));
        $("#output #permanentAddress").shouldHave(text("other address"));
    }
}
