package LearnCodingjava;
import java.util.*;

public class _26_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n , arm= 0, rem, c;
        n = sc.nextInt();
        c = n;
        while(n>0){
            rem = n%10;
            arm = (rem * rem * rem) + rem;
            n = n /10;
        }
        if(c == arm)
            System.out.println("Armstrong Number");
        else
            System.out.println("NotArmstrong Number ");
    }
}

