package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _11_nestedthreeorfivebutnotfifteen {
    //Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0) {
            if (n % 15 != 0) {
                System.out.println("The number is divisible by 3 or 5 but not divisible by 15");
            } else {
                System.out.println("Not matching the requred condition");
            }
            } else{
                System.out.println("Not matching the requred condition");
            }
            }
        }

