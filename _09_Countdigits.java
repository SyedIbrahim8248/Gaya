package LearnCodingjava;
import java.util.*;

public class _09_Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.println("Enter any Number");
        n = sc.nextInt();
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Number of Digits " +count);
    }
}
