import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ClassesDateDifference {
    public static void main(String[] args) {
    Date date1 = new Date(2023, 1, 1);
        Date date2 = new Date(2023, 1, 10);
        System.out.println("Difference in days: " + Date.differenceInDays(date1, date2));
}
}

class Date {
    LocalDate date;

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    // Method to compare two dates
    public static long differenceInDays(Date d1, Date d2) {
        return ChronoUnit.DAYS.between(d1.date, d2.date);
    }

}

