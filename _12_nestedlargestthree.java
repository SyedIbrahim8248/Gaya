package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _12_nestedlargestthree {
    //Take 3 positive integers input and print the greatest of them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.println("Enter third numbers: ");
        int c = sc.nextInt();
        if(a>b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        }
    }
}
