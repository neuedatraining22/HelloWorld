import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime lunchtime = LocalTime.of(13,30);
        System.out.println(lunchtime);

        LocalDateTime  now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"))    ) ;

        LocalDate myBirthday = LocalDate.of(1996,5,17);
        Period period = Period.between(myBirthday, LocalDate.now());
        System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months, and "
        +period.getDays() + " days old.");
        System.out.println(period);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        Instant rightNow = Instant.now();
        System.out.println(rightNow);

    }
}
