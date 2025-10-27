package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _10_nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //WAP to find if a number is divisible by both 3 & 5
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num%5==0) {
            if(num%3==0) {
                System.out.println("The number is divisible by 3 and 5");
            } else {
                System.out.println("The number is not divisible by 5 and 3");
            }

        } else {
            System.out.println("not divisible");


        }

    }
}
