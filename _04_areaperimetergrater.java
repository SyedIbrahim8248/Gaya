package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _04_areaperimetergrater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght :");
        int lenght = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = lenght * breadth;
        int perimeter = 2 * lenght * breadth;
        if(area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Perimeter is less than area");
        }
    }
}
