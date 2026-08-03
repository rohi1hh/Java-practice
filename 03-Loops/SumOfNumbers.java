import java.util.*;
class SumOfNumbers{
    public static void main(String[] args) {
        int sum=0;
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
