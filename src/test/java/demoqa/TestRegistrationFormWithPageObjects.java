package demoqa;

import com.codeborne.selenide.Configuration;
import demoqa.page.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TestRegistrationFormWithPageObjects {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void parameters() {

        registrationPage.openPage()
                .setFirstName()
                .setLastName()
                .setUseremail()
                .setGender()
                .setNumber()
                .setDateOfBirth()
                .setSubject()
                .setHobbies()
                .setUploadPicture()
                .setCurrentAddress()
                .setState()
                .setCity()
                .setSubmit()

                .chekResult();

    }
}