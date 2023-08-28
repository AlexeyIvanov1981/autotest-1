package io.cingo.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void browserSize() {
        Configuration.startMaximized = true;
        Configuration.browser = "FIREFOX";
//        Configuration.browserSize = "1900x1240";
    }
}
