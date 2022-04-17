package page;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();

  //  SelenideElement firstName = $("id=firstNme");
  //  SelenideElement lastName = $("[id=lastName]");
  //  SelenideElement userEmail = $("[id=userEmail]");
  //  SelenideElement gender = $(byText(Gender));
  //  SelenideElement userNumber = $("[id=userNumber]");
   // SelenideElement DateOfBirth = $("[id=dateOfBirthInput]").click();


  //  SelenideElement userNumber = $("[id=userNumber]");
  //  SelenideElement CurrenAdress = $("[id=currentAddress]");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        $("[id=firstName]").setValue(firstName);
        return this;

    }

    public RegistrationPage setLastName (String lastName) {
        $("[id=lastName]").setValue(lastName);
        return this;
    }

    public RegistrationPage setUseremail (String userEmail) {
        $("[id=userEmail]").setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender (String gender) {
        $("id=genterWrapper").$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setNumber (String userNumber) {
        $("[id=userNumber]").setValue(userNumber);
        return this;
    }

    public RegistrationPage setdateOfBirth (String day, String month, String year){
        $("[id=dateOfBirthInput]").click();
        calendar.SetDate(day,month,year);
        return this;
    }

    public RegistrationPage setSubject (String subject){
        $("[id=subjectsInput]").setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies (String hobbies) {
        $(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage setUploadPicture (String foto) {
        $("[id=uploadPicture]").uploadFromClasspath(foto);
        return this;
    }

    public RegistrationPage setCurrentAddress(String CurrenAdress) {
        $("[id=currentAddress]").setValue(CurrenAdress);
        return this;
    }

    public RegistrationPage setState (String state) {
        $("[id=state]").click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity (String city) {
        $("[id=city]").click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationPage setSubmit () {
        $("[id=submit]").click();
        return this;
    }




}
