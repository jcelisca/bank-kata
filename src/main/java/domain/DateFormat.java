package domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    public static LocalDate date(String currentDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(currentDate, format);
        return date;
    }
}
