package Javabydeepaksir;

import java.util.Scanner;

public class _13a_scannerpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");

        }
    }
}
