package LearnCodingjava;
import java.util.*;

public class _29_sumofNnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of term");
        int n, sum = 0;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(" Addition " + sum);
    }
}
