package LearnCodingjava;
import java.util.*;

public class _23_Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y ;
        System.out.println("Enter any year");
        y = sc.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0 ){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
