package lab2;

public class ex9 {
    public static void main(String[] args) {
        int fee = 10000;
        double increaseRate = 0.05;
        int year = 0;
        for (int i = 0; i < 10; i++) {
            fee += fee * increaseRate;
            year++;
            System.out.println("Year: " + year + ", fee: " + fee);
        }
    }
}
