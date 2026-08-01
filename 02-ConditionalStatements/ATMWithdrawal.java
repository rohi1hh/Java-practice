import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount % 100 != 0) {
            System.out.println("Amount should be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}
