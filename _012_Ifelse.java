package ibrahimjava;
import java.util.Scanner;

public class _012_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
            System.out.println("syed");
        } else {
            System.out.println("Odd number");
            System.out.println("ibrahim");
        }
    }
}
