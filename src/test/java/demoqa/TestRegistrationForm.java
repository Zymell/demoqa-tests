package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class  TestRegistrationForm {
    @BeforeAll
    static void BeforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void parameters(){
        String First_name = "Alexander";
        open("/automation-practice-form");

        $("[id=firstName]").setValue(First_name); // Ввод Имени
        $("[id=lastName]").setValue("Popov"); // Ввод фамилии
        $("[id=userEmail]").setValue("example1993@gmail.com"); //Ввод электронной почты
        $(byText("Male")).click();  //выбор пола
        $("[id=userNumber]").setValue("89527245788"); // Ввод номера
        $("[id=dateOfBirthInput]").click(); // Ввод даты рождения
        $(".react-datepicker__month-select").selectOption("October"); //Выбор месяца
        $(".react-datepicker__year-select").selectOption("1993"); //Выбор года
        $("[aria-label$='October 27th, 1993']").click();
        $("[id=subjectsInput]").setValue("English").pressEnter();
        $(byText("Sports")).click();
        $("[id=uploadPicture]").uploadFromClasspath("Lesson_2.png");
        $("[id=currentAddress]").setValue("Russia Stalina streat 37");
        $("[id=currentAddress]").setValue("Russia Stalina streat 37");
        $("[id=currentAddress]").setValue("Russia Stalina streat 37");




    }
}

