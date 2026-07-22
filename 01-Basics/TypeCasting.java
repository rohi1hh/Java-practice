public class TypeCasting {
    public static void main(String[] args) {

        int num = 10;
        double value = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer Value = " + num);
        System.out.println("Double Value = " + value);

        double number = 25.75;
        int result = (int) number;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value = " + number);
        System.out.println("Integer Value = " + result);
    }
}
