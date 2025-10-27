package ibrahimjava;
import java.util.Scanner;
public class _016_FourDigittNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
    //    if(n > 999 &&  n < 10000)
      //      System.out.println("4 Digit Number");
        //else
          //  System.out.println("Not a 4 Digit Number");
        if(n%5 == 0 || n%3 == 0)
            System.out.println("Divisible by 3 or 5 ");
        else System.out.println("Not Divisible by 5 or 3 ");
    }

}
