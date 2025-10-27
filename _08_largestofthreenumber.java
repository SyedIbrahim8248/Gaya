package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _08_largestofthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take 3 positive integers input and print the greatest of them
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println("The largest number is "+a);
        }
        if(b>a && b>c) {
            System.out.println("The largest number is "+b);
        }
        if(c>a && c>b) {
            System.out.println("The largest number is "+c);
        }
    }
}
