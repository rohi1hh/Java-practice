import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a <= b && a <= c) {
            System.out.println("Smallest number is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
    }
}
