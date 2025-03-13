package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxest {


    static @BeforeAll
    void beforeAll() {
//        Configuration.browserSize = "1920x1080";
        Configuration.browserSize = "1366x768";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }



    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("Alex@egorov.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Another street 1");
        $("#submit").click();

        $("#output #name").shouldHave(text("Alex"));
        $("#output #email").shouldHave(text("Alex@egorov.com"));
        $("#output #currentAddress").shouldHave(text("Some street 1"));
        $("#output #permanentAddress").shouldHave(text("Another street 1"));

    /*
        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("Alex@egorov.com"));
        $("#currentAddress", 1).shouldHave(text("Some street 1"));
        $("#permanentAddress", 1).shouldHave(text("Another street 1"));

    */

    /*
        $("#output").$("#name").shouldHave(text("Alex"));
        $("#output").$("#email").shouldHave(text("Alex@egorov.com"));
        $("#output").$("#currentAddress").shouldHave(text("Some street 1"));
        $("#output").$("#permanentAddress").shouldHave(text("Another street 1"));
    */

    }

}

