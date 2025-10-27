package Ifelsebyraghavsir.java;
import java.util.Scanner;

public class _01_Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int n = sc.nextInt();
       // System.out.println(n);
       //System.out.println(n*n);
        if(n%2==0) {
            System.out.println("The number is even");
        }if(n%2!=0) {
            System.out.println("The number is odd");
        }


    }
}
