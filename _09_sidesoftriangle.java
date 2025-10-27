package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _09_sidesoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take 3 numbers input and tell if they can be the sides of a triangle
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        System.out.println("Enter the second");
        int b = sc.nextInt();
        System.out.println("Enter the third");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
