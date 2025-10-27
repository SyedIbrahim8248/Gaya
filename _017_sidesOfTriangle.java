package ibrahimjava;
import java.util.Scanner;

public class _017_sidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Valid Triangle");
        else System.out.println("Invalid Traingle");
    }
}
