package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
//        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Kir");
        $("#userEmail").setValue("writeHere@mail.com");
        $("#currentAddress").setValue("Grove street");
        $("#permanentAddress").setValue("Home, sweet home");
        $("#submit").click();

        $("#output #name").shouldHave(text("Kir"));
        $("#output #email").shouldHave(text("writeHere@mail.com"));
        $("#output").$("#currentAddress").shouldHave(text("Grove street"));   // for now this way is useful
        $("#output").$("#permanentAddress").shouldHave(text("Home, sweet home"));   // for now this way is useful
    }
}
