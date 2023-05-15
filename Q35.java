import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q35 {

    public static void main(String[] args) {

        LocalDate date1 =  LocalDate.now();
        // Will throw an exception, expected yyyy-mm-dd, provided dd-mm-yyyy
        LocalDate date2 = LocalDate.of(6,20,2014);
        // No ISO_DATE_TIME! Will throw an exception
        LocalDate date3 =  LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
    }
}
