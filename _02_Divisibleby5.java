package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _02_Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0)  {
            System.out.println(" The number you entered is divisible by 5");
            System.out.println("Good Morning");
        } else {
            System.out.println(" The number you entered is  Not divisible by 5");
            System.out.println("Good Afternoon");
        }


    }
}
