package Javabydeepaksir;

import java.util.Scanner;

public class _20_Gettinguserinputinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: : ");
        String name = sc.nextLine();
        System.out.println("Enter your age: : ");
        int age = sc.nextInt();
        System.out.println("Enter your height: : ");
        int height = sc.nextInt();
        System.out.println("Enter your weight: : ");
        int weight = sc.nextInt();
        System.out.println("Enter your gender: : ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your birthday: : ");
        String birthday = sc.nextLine();
        System.out.println("Enter your hometown: : ");
        String hometown = sc.nextLine();
        System.out.println("Enter you phone number: : ");
        long phone = sc.nextLong();


    }
}
