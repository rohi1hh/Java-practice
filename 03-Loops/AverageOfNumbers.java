import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }

        double average = sum / n;

        System.out.println(average);

        sc.close();
    }
}
