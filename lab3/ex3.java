package lab3;

import java.util.GregorianCalendar;

public class ex3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("today's date: "
                + calendar.get(GregorianCalendar.YEAR) + "-"
                + calendar.get(GregorianCalendar.MONTH) + "-"
                + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
