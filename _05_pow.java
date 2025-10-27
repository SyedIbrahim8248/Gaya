package LearnCodingjava;
import java.util.*;

public class _05_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int p;
        int result = 1;
        System.out.println("Enter Number");
        n = sc.nextInt();
        p = sc.nextInt();
        System.out.println("Enter power");
        for(int i = 1;i<=p;i++){
            result = n*result;
        }
        System.out.println("Power " + result);
    }
}
