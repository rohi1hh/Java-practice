import java.util.*;

class CalculateCompoundInterestForNYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int n = sc.nextInt();

        double amount = p * Math.pow(1 + r / 100, n);
        double ci = amount - p;

        System.out.println("Compound Interest: " + ci);
        System.out.println("Amount: " + amount);
    }
}
