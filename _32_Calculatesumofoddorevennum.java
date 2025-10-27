package LearnCodingjava;
import java.util.*;

public class _32_Calculatesumofoddorevennum {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n , i, sum = 0;
        System.out.println("Enter Range");
        n = sc.nextInt();
        if(n%2==0)
        {
            for(i = 0;i<=n;i= i+2)
            {
                sum = sum+i;
            }
            System.out.println(" Sum of Even Number " + sum);
        } else {
            for(i = 1;i<=n;i = i+2)
            {
                sum = sum+i;
            }
            System.out.println(" Sum of Odd Number " + sum);
        }
    }
}
