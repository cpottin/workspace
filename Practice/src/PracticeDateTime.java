import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PracticeDateTime {
    public static void main(String[] args) {
LocalDate today = LocalDate.now();

int dayNumber = today.getDayOfMonth();
Month month = today.getMonth();
int monthNumber = today.getMonthValue();

DayOfWeek day = today.getDayOfWeek();

        System.out.println(dayNumber + " " + month);


//        LocalDate today = LocalDate.now();
//        System.out.println("today = " + today);
//        LocalDate theDayAfterTomorrow = today.plusDays(2);
//        System.out.println("the day after tomorrow = " + theDayAfterTomorrow);
//
//        LocalDate localDate
//                = LocalDate.of(2016, Month.AUGUST, 23);
//        System.out.println("localDate = " + localDate);
//
//        LocalTime localTime = LocalTime.now();
//        System.out.println("localTime = " + localTime);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("local Date time = " + localDateTime);
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println("zoned Date and Time = " + zonedDateTime);
//
//        LocalDate bday = LocalDate.of(2023, 1, 14);
//        System.out.println(bday);
    }
}
