package page;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void SetDate(String day, String month, String year){
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker_day--0" + day +
                ":not(.react-datepicker_day--outside-month)").click();
       }
}
