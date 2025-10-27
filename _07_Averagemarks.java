package LearnCodingjava;
import java.util.*;

public class _07_Averagemarks {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a,b,c,d,e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        System.out.println("Enter marks of five subjects");
        int sum = a+b+c+d+e;
        System.out.println("Total marks" + sum);
        double avg = sum/5.0;
        System.out.println("Average marks" + avg);

    }
}
