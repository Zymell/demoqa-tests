package demoqa;

import com.codeborne.selenide.Configuration;
import demoqa.page.RegistrationPage;
import com.github.javafaker.Faker;
import demoqa.page.CalendarComponent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class TestRegistrationFormWithPageObjects {
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    CalendarComponent calendar = new CalendarComponent();

    String  firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            userNumber = faker.numerify("###########"),
            day = "27",
            month = "October",
            year = "1993",
            subject = "English",
            hobbies = "Sports",
            CurrenAdress = faker.address().streetAddress(),
            foto = "Lesson_2.JPG",
            state = "NCR",
            city = "Delhi";

    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void parameters() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUseremail(userEmail)
                .setGender(gender)
                .setNumber(userNumber)
                .setDateOfBirth(day,month,year)
                .setSubject(subject)
                .setHobbies(hobbies)
                .setUploadPicture(foto)
                .setCurrentAddress(CurrenAdress)
                .setState(state)
                .setCity(city)
                .setSubmit();
        registrationPage.chekResult("Student name",firstName);






    }
}