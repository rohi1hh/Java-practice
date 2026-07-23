public class LogicalOperaterr{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
      
        System.out.println("AND (&&): " + (a < b && b > 15));

        System.out.println("OR (||): " + (a > b || b > 15));

        System.out.println("NOT (!): " + !(a > 5));
    }
}
