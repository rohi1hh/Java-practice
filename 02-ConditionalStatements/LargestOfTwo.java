import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
