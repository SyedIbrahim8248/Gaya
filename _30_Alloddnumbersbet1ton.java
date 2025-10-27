package LearnCodingjava;
import java.util.*;

public class _30_Alloddnumbersbet1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter No of Term");
        n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}
