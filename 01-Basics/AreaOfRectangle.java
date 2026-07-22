import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = input.nextDouble();

        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle = " + area);
    }
}
