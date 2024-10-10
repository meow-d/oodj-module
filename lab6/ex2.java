package lab6;

import java.util.GregorianCalendar;

public class ex2 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current date");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}

class Time {
    long milliSeconds;
    long totalSeconds;
    int second;

    public Time() {
        this.milliSeconds = System.currentTimeMillis();
        this.totalSeconds = this.milliSeconds / 1000;
        this.second = (int) (this.totalSeconds % 60);
    }
}
