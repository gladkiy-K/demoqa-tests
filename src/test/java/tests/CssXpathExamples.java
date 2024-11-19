package tests;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpath() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">

        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid='email']").setValue("1");


        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("#email").setValue("1");
        $("[id=email]").setValue("1");
        $(by("id", "email")).setValue("1");
        $(byId("email")).setValue("1");
        $x("//*[@id='email']").setValue("1");


        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("#name").setValue("1");
        $("[id=name]").setValue("1");
        $(by("name", "email")).setValue("1");
        $(byName("email")).setValue("1");
        $x("//*[@id='email']").setValue("1");


        // <input type="email" class="inputtext login_form_input_box">
        $(".inputtext").$(".login_form_input_box").setValue("1");
        $("[class=inputtext]").$("[class=login_form_input_box]").setValue("1");
        $(by("class", "inputtext")).$(by("class", "login_form_input_box")).setValue("1");
        $(byClassName("inputtext")).$(byClassName("login_form_input_box")).setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box").setValue("1");
        $(".inputtext").$(".login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");

        // <div>Hello, qa.guru!</div>
        $(byText("Hello, qa.guru!"));
        $(withText("llo, qa.g"));
        $x("//*[text()='Hello, qa.guru!']"); // wrong
        $x("//*[contains(text(),'Hello, qa.guru!')]");
    }
}


