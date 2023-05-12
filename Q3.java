import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3{

public static void main(String[] args) {
        // works
        parseDate();

        // fails, impossible to transfer a localDate to localDatetime
        parseDateTime();

    }

    static void parseDateTime() {
        String date = LocalDate.parse("2023-05-12")
                .format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);
    }

    static void parseDate() {
        String date = LocalDate.parse("2023-05-12")
                .format(DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }

}