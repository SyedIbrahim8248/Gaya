package ibrahimjava;
import java.util.Scanner;

public class _018_GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int a = sc.nextInt();
        System.out.println("Enyer 2nd no:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no:");
        int c = sc.nextInt();
      //  if(a>b && a>c) System.out.println(a);
        //if(b>a && b>c) System.out.println(b);
        //if(c>a && c>b) System.out.println(c);
//if(a>=b && a>=c) System.out.println(a);
      //  else if(b>=a && b>=c) System.out.println(b);
     // else  System.out.println(c);
        if(a>=b){
            if(a>=c) System.out.println(a);
            else//c>a
                System.out.println(c);
        } else {//b>
            if(b>=c) System.out.println(b);
             else//c> b
                 System.out.println();
        }



    }
}
