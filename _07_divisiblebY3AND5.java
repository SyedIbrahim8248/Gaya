package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _07_divisiblebY3AND5 {
    public static void main(String  [] args) {
        Scanner sc = new Scanner(System.in);
        //Tke positive integer input and tell if it is divisible by 5 and 3
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0) {
            System.out.println("The number is divisible by 3 and 5");
        } else {
            System.out.println("The number is not divisible by 5 and 3");
        }

    }

}
