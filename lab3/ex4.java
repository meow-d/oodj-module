package lab3;

public class ex4 {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("Current time: "
                + time.getHour() + ":"
                + time.getMinute() + ":"
                + time.getSecond());
    }
}

class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        long currentTimeMillis = System.currentTimeMillis();
        this.hour = (int) currentTimeMillis % 86400000 / 3600000;
        this.minute = (int) (currentTimeMillis % 3600000) / 60000;
        this.second = (int) (currentTimeMillis % 60000) / 1000;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
