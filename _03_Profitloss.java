package Ifelsebyraghavsir.java;

import java.util.Scanner;

public class _03_Profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price :");
        int cp = sc.nextInt();
        System.out.println("Enter selling  price :");
        int sp = sc.nextInt();
        if(cp >sp) {
            System.out.println("You gained a prifit");
        }
        if(sp>cp) {
            System.out.println("You lost a prifit");
            //profit
            System.out.println("your profit is");
            System.out.println(sp-cp);
            //loss
            System.out.println("your loss is");
            System.out.println(cp-sp);
        }

    }
}
