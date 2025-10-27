package LearnCodingjava;
import java .util.*;

public class _04_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println("The max num is a" + " ");
        } else {
            System.out.println( "The max num is b" + " ");
        }
    }
}
