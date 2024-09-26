package lab2;

public class ex8 {
    public static void main(String[] args) {
        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }

        double sum = 0;
        for (double i : arr) {
            sum += i;
            System.out.println("arr: " + i + ", sum: " + sum);
        }

        System.out.println("Sum: " + sum);
    }
}
