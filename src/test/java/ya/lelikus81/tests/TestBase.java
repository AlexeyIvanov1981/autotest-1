package ya.lelikus81.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ya.lelikus81.pages.RegistrationPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void browserSize() {
        Configuration.startMaximized = true;
        Configuration.browser = "FIREFOX";
//        Configuration.browserSize = "1900x1240";
    }
}
