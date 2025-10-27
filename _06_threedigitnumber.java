package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _06_threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>99 && num<1000) {
            System.out.println("This is a 3 digit number");
        } else {
            System.out.println("This is not a 3 digit number");
        }

    }
}
