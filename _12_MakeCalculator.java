package LearnCodingjava;
import java.util.*;

public class _12_MakeCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers");
        int n1;
        int n2;
        int ch;
        int cal;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.print("Select operation");
        ch = sc.nextInt();
        if(ch ==1){
            cal = n1+n2;System.out.print("Addition" +cal);
        } else if(ch==2){
            cal = n1-n2;
            System.out.print("Substrction" +cal);
        } else if(ch ==3){
            cal = n1*n2;
            System.out.print("Multiplication" +cal);
        } else if(ch ==4){
            cal = n1/n2;
            System.out.print("Division" +cal);
        } else{
            cal = n1%n2;
            System.out.print("Remainder" +cal);
        }


    }

}
