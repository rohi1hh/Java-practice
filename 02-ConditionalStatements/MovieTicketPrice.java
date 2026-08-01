import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Is it a weekend? (true/false): ");
        boolean weekend = sc.nextBoolean();

        int price = 200;

        if (age < 12) {
            price = 100;
        } else if (age >= 60) {
            price = 120;
        }

        if (weekend) {
            price += 50;
        }

        System.out.println("Ticket Price: ₹" + price);
    }
}
