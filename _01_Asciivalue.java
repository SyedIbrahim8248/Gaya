package LearnCodingjava;
import java.util.*;

public class _01_Asciivalue {
    public static void main(String[] args) {
       // char ch;
       // System.out.println("enter any Character");
        //Scanner sc  = new Scanner(System.in);
        //ch = sc.next().charAt(0);
       // int a = ch;
       // System.out.println("Ascii value of" +ch +" is " + a);

        //public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
     /*   int n = sc.nextInt();
        String ans = (n % 2 == 0) ? "even" : "odd";
        System.out.println(ans);*/
            int value = sc.nextInt();
        /*if(value % 2 == 0 && value % 3 == 0) {
            System.out.println("found ans "+value) ;*/
            //wap to print the value if it is divisible by 3 0r 5,
            if(value % 5 ==0 || value % 3 ==0) {
                System.out.println("found ans "+value) ;
            }
        }
    }


