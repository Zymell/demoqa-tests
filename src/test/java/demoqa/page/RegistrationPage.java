package demoqa.page;

import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            userNumber = faker.numerify("###########"),
            day = "27",
            month = "October",
            year = "1993",
            subject = "English",
            hobbies = "Sports",
            currentAdress = faker.address().streetAddress(),
            foto = "Lesson_2.JPG",
            state = "NCR",
            city = "Delhi";

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName() {
        $("[id=firstName]").setValue(firstName);
        return this;

    }

    public RegistrationPage setLastName() {
        $("[id=lastName]").setValue(lastName);
        return this;
    }

    public RegistrationPage setUseremail() {
        $("[id=userEmail]").setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender() {
        $(byText(gender)).click();
        return this;
    }

    public RegistrationPage setNumber() {
        $("[id=userNumber]").setValue(userNumber);
        return this;
    }

    public RegistrationPage setDateOfBirth() {
        $("[id=dateOfBirthInput]").click();
        calendar.setDateOfBirth(day, month, year);
        return this;
    }

    public RegistrationPage setSubject() {
        $("[id=subjectsInput]").setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies() {
        $(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage setUploadPicture() {
        $("[id=uploadPicture]").uploadFromClasspath(foto);
        return this;
    }

    public RegistrationPage setCurrentAddress() {
        $("[id=currentAddress]").setValue(currentAdress);
        return this;
    }

    public RegistrationPage setState() {
        $("[id=state]").click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity() {
        $("[id=city]").click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationPage setSubmit() {
        $("[id=submit]").click();
        return this;
    }

    public RegistrationPage chekResult() {
        $(".table-responsive").shouldHave(text(firstName), text(lastName), text(userEmail),
                text(currentAdress), text(gender), text(day + " " + month + "," + year), text(subject), text(hobbies),
                text(foto), text(state + " " + city));
        return this;
    }


}
